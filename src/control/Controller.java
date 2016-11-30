/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.*;
import view.*;

/**
 *
 * @author agungrb
 */
public class Controller implements ActionListener {

    private Aplikasi app;
    private View view;
    private Pengguna session;
    private Barang b;
    
    public Controller(Aplikasi app) {
        this.app = app;
        session = null;
        b = null;
        halamanutama();
    }
    
    private void halamanutama() {
        ViewHalamanUtama x = new ViewHalamanUtama();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void login() {
        ViewLogin x = new ViewLogin();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void mutasidata() {
        ViewMutasiData x = new ViewMutasiData();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void olahdata() {
        ViewOlahData x = new ViewOlahData();
        for (LokasiAset l : app.listLokasi) {
            x.setLokasi_brg(l);
            x.setLokasi_brg2(l);
        }
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void pelaporan() {
        ViewPelaporan x = new ViewPelaporan();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(view instanceof ViewLogin) {
            ViewLogin x = (ViewLogin) view;
            if(source.equals(x.getBtnLogin())) {
                String username = x.getTxFieldUsername();
                String psw = x.getTxFieldPassword();
                session = app.cariPengguna(username, psw);
                if(session != null) {
                    JOptionPane.showMessageDialog(x.getRootPane(), "Selamat Datang, "+session.getNamaUser(), "Berhasil Login", 1);
                    halamanutama();
                    x.dispose();
                }
                else {
                    JOptionPane.showMessageDialog(x.getRootPane(), "Akun tidak ditemukan", "Gagal Login", 0);
                }
            }
        }
        else if(view instanceof ViewHalamanUtama){
            ViewHalamanUtama x = (ViewHalamanUtama) view;
            if(source.equals(x.getbLogout())) {
                int p = JOptionPane.showConfirmDialog(x.getRootPane(), "Anda yakin ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if(p == JOptionPane.YES_OPTION) {
                   session = null;
                   login();
                   x.dispose(); 
                }
            }
            else if(source.equals(x.getbOlahData())) {
                olahdata();
                x.dispose();
            }
            else if(source.equals(x.getbPelaporan())) {
                pelaporan();
                x.dispose();
            }
            else if(source.equals(x.getbMutasi())) {
                mutasidata();
                x.dispose();
            }
        }
        else if(view instanceof ViewMutasiData) {
            ViewMutasiData x = (ViewMutasiData) view;
            if(source.equals(x.getBtnKembali())) {
                halamanutama();
                x.dispose();
            }
        }
        else if(view instanceof ViewOlahData) {
            ViewOlahData x = (ViewOlahData) view;
            if(source.equals(x.getBtnKembali())) {
                b = null;
                halamanutama();
                x.dispose();
            }
            else if(source.equals(x.getBtnSubmit_brg())) {
                try {
                    String harga = x.getTxHarga_brg();
                    int jumlah = x.getTxJumlah_brg();
                    String kategori = x.getTxKategori_brg();
                    String nama = x.getTxNama_brg();
                    String pemilik = x.getTxPemilik_brg();
                    LokasiAset lokasi = (LokasiAset) x.getLokasi_brg();
                    if(!harga.equals("") && jumlah!=0 && !kategori.equals("") && 
                        !nama.equals("") && !pemilik.equals("") && lokasi!=null) {
                        Barang b = new Barang(app.getKodeBarang(),nama,pemilik,jumlah,kategori,harga,lokasi);
                        app.addBarang(b);
                        JOptionPane.showMessageDialog(x.getRootPane(), "Data telah disimpan", "Berhasil", 1);
                    }
                    else {
                        JOptionPane.showMessageDialog(x.getRootPane(), "Kolom harus diisi semua", "Gagal", 0);
                    }
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(x.getRootPane(), ee, "Gagal", 0);
                }
                
                
            }
            else if(source.equals(x.getBtnRefresh_brg())) {
                int i = 0;
                for (Barang b : app.listBarang) {
                    x.showData_brg(b.getKodeAset(), b.getNamaAset(), b.getKategoriAset(), 
                            b.getJumlahAset(), b.getHargaAset(), b.getLokasiAset().getNamalokasi(), i);
                    i++;
                }
            }
            else if(source.equals(x.getBtnRefresh_lhn())) {
                int i = 0;
                for (Lahan l : app.listLahan) {
                    x.showData_lhn(l.getKodeAset(), l.getLuasLahan(), l.getNamaAset(), 
                            l.getHargaAset(), l.getPemilikAset(), i);
                    i++;
                }
            }
            else if(source.equals(x.getBtnSubmit_lok())) {
                try {
                    String kode = x.getTxKodeLokasi();
                    String nama = x.getTxNamaLokasi();
                    if(!kode.equals("") && !nama.equals("")) {
                        app.addLokasiAset(new LokasiAset(kode,nama));
                        JOptionPane.showMessageDialog(x.getRootPane(), "Data telah disimpan", "Berhasil", 1);
                        olahdata();
                    }
                    else {
                        JOptionPane.showMessageDialog(x.getRootPane(), "Kolom harus diisi semua", "Gagal", 0);
                    }
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(x.getRootPane(), ee, "Gagal", 0);
                }
                
            }
            else if(source.equals(x.getBtnSubmit_lhn())) {
                try {
                    String kategori = x.getTxKategori_lhn();
                    String nama = x.getTxNama_lhn();
                    String pemilik = x.getTxPemilik_lhn();
                    String luas = x.getTxLuas_lhn();
                    String harga = x.getTxHarga_lhn();
                    
                    if(!kategori.equals("") && !nama.equals("") && !pemilik.equals("")
                            && !luas.equals("") && !harga.equals("")) {
                        Lahan l = new Lahan(luas,app.getKodeLahan(),nama,pemilik,kategori,harga);
                        app.addLahan(l);
                        JOptionPane.showMessageDialog(x.getRootPane(), "Data telah disimpan", "Berhasil", 1);
                    }
                    else {
                        JOptionPane.showMessageDialog(x.getRootPane(), "Kolom harus diisi semua", "Gagal", 0);
                    }
                } catch (Exception ee) {
                    
                }
            }
            else if(source.equals(x.getBtnCari_upd())) {
                String kode_brg = x.getTxKode_upd();
                b = app.cariBarang(kode_brg);
                if(b != null) {
                    x.setTxNama_upd(b.getNamaAset());
                    x.setTxHarga_upd(b.getHargaAset());
                    x.setTxJumlah_upd(b.getJumlahAset());
                    x.setSelected_Lokasi_brg2(b.getLokasiAset());
                    JOptionPane.showMessageDialog(x.getRootPane(), "Barang ditemukan", "Ditemukan", 1);
                }
                else {
                    JOptionPane.showMessageDialog(x.getRootPane(), "Barang tidak ditemukan", "Gagal", 0);
                }
            }
            else if(source.equals(x.getBtnSubmit_upd())) {
                try {
                    if(b!=null) {
                        String nama = x.getTxNama_upd();
                        int jumlah = x.getTxJumlah_upd();
                        String harga = x.getTxHarga_upd();
                        LokasiAset lokasi = (LokasiAset) x.getLokasi_brg2();
                        if(!nama.equals("") && jumlah != 0 && !harga.equals("") && lokasi != null) {
                            b.setNamaAset(nama);
                            b.setJumlahAset(jumlah);
                            b.setHargaAset(harga);
                            b.setLokasiAset(lokasi);
                            app.listBarang.set(app.listBarang.indexOf(b), b);
                            JOptionPane.showMessageDialog(x.getRootPane(), "Data telah disimpan", "Berhasil", 1);
                        } else {
                            JOptionPane.showMessageDialog(x.getRootPane(), "Kolom harus diisi semua", "Gagal", 0);
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(x.getRootPane(), "Cari barang telebih dahulu", "Gagal", 0);
                    }
                    
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(x.getRootPane(), ee, "Gagal", 0);
                }
            }
            
        }
        else if(view instanceof ViewPelaporan) {
            ViewPelaporan x = (ViewPelaporan) view;
            if(source.equals(x.getBtnKembali())) {
                halamanutama();
                x.dispose();
            }
        }
    }
    
}
