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
public class Barang extends DataAset {
    
    private ArrayList<Riwayat> riwayat = new ArrayList();
    private String kondisi;
    
    public void addRiwayat(Riwayat h) {
        riwayat.add(h);
    }

    public Barang(String kodeAset, String namaAset, String pemilikAset, int jumlahAset, String KategoriAset, long hargaAset, LokasiAset lokasiAset) {
        super(kodeAset, namaAset, pemilikAset, KategoriAset, hargaAset);
        super.setLokasiAset(lokasiAset);
        super.setJumlahAset(jumlahAset);
        kondisi = "Ready";
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    
    
    
}

