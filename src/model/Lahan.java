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

    public Lahan(String luasLahan, String kodeAset, String namaAset, String pemilikAset, String KategoriAset,long hargaAset) {
        super(kodeAset, namaAset, pemilikAset, KategoriAset, hargaAset);
        this.luasLahan = luasLahan;
    }  

    public String getLuasLahan() {
        return luasLahan;
    }
    
    
}
