/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author agungrb
 */
public class Aplikasi {
    public ArrayList<LokasiAset> listLokasi;
    public ArrayList<Lahan> listLahan;
    public ArrayList<Barang> listBarang;
    public ArrayList<Pengguna> listPengguna;
    private int kodeBarang,kodeLahan;

    public Aplikasi() {
        listLokasi = new ArrayList();
        listLahan = new ArrayList();
        listBarang = new ArrayList();
        listPengguna = new ArrayList();
        kodeBarang = 0;kodeLahan = 0;
    }
 
    public void addPengguna(Pengguna p) {
        listPengguna.add(p);
    }
    public void addLahan(Lahan lahan) {
        listLahan.add(lahan);
        kodeLahan++;
    }
    public void addBarang(Barang barang) {
        listBarang.add(barang);
        kodeBarang++;
    }
    public void addLokasiAset(LokasiAset lokasi) {
        listLokasi.add(lokasi);
    }
    public Pengguna cariPengguna(String username, String password) {
        for (Pengguna p : listPengguna) {
            if(p.getUsername().equals(username) && p.getPassword().equals(password)) {
                return p;
            }
        }
        return null;
    }
    public Barang cariBarang(String kodeaset) {
        for (Barang b : listBarang) {
            if(b.getKodeAset().equals(kodeaset)) {
                return b;
            }
        }
        return null;
    }

    public String getKodeBarang() {
        return "BRG-"+kodeBarang;
    }

    public String getKodeLahan() {
        return "LHN-"+kodeLahan;
    }
    
    
    
}
