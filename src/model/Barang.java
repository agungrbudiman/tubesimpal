/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author agungrb
 */
public class Barang extends DataAset {

    public Barang(String kodeAset, String namaAset, String pemilikAset, int jumlahAset, String KategoriAset, String hargaAset, LokasiAset lokasiAset) {
        super(kodeAset, namaAset, pemilikAset, KategoriAset, hargaAset);
        super.setLokasiAset(lokasiAset);
        super.setJumlahAset(jumlahAset);
    }
    
}

