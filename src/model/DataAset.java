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
    private long hargaAset;
    private LokasiAset lokasiAset;

    public DataAset(String kodeAset, String namaAset, String pemilikAset, String KategoriAset, long hargaAset) {
        this.kodeAset = kodeAset;
        this.namaAset = namaAset;
        this.pemilikAset = pemilikAset;
        this.KategoriAset = KategoriAset;
        this.hargaAset = hargaAset;
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
    
    public long getHargaAset(){
        return hargaAset;
    }
    public void setHargaAset(long hargaAset) {
        this.hargaAset = hargaAset;
    }
    
    public LokasiAset getLokasiAset() {
        return lokasiAset;
    }
    
    public void setLokasiAset(LokasiAset lokasiAset) {
        this.lokasiAset = lokasiAset;
    }

    public String getKategoriAset() {
        return KategoriAset;
    }

    public void setKategoriAset(String KategoriAset) {
        this.KategoriAset = KategoriAset;
    }
    
    
}
