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
public class Lahan extends DataAset {
    private String luasLahan;

    public Lahan(String luasLahan, String kodeAset, String namaAset, String pemilikAset, int jumlahAset, String KategoriAset, String hargaAset, String lokasiAset) {
        super(kodeAset, namaAset, pemilikAset, jumlahAset, KategoriAset, hargaAset, lokasiAset);
        this.luasLahan = luasLahan;
    }  
}
