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
public class DataAset {
    private String kodeAset;
    private String namaAset;
    private String pemilikAset;
    private int jumlahAset;
    private String KategoriAset;
    private String hargaAset;
    private String lokasiAset;

    public DataAset(String kodeAset, String namaAset, String pemilikAset, int jumlahAset, String KategoriAset, String hargaAset, String lokasiAset) {
        this.kodeAset = kodeAset;
        this.namaAset = namaAset;
        this.pemilikAset = pemilikAset;
        this.jumlahAset = jumlahAset;
        this.KategoriAset = KategoriAset;
        this.hargaAset = hargaAset;
        this.lokasiAset = lokasiAset;
    }
    
    
    
    public String getKodeAset() {
        return kodeAset;
    }
    public void setKodeAset(String kodeAset){
        this.kodeAset = kodeAset;
    }
    
    public String getNamaAset() {
        return namaAset;
    }
    public void setNamaAset(String namaAset){
        this.namaAset = namaAset;
    }
    
    public String getPemilikAset() {
        return pemilikAset;
    }
    public void setPemilikAset(String pemilikAset){
        this.pemilikAset = pemilikAset;
    }
    
    public int getJumlahAset() {
        return jumlahAset;
    }
    public void setJumlahAset(int jumlahAset) {
        this.jumlahAset = jumlahAset;
    }
    
    public String getHargaAset(){
        return hargaAset;
    }
    public void setHargaAset(String hargaAset) {
        this.hargaAset = hargaAset;
    }
    
    public String getLokasiAset() {
        return lokasiAset;
    }
    public void setLokasiAset(String lokasiAset) {
        this.lokasiAset = lokasiAset;
}
}
