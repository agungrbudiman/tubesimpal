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
public class LokasiAset {
    private String namalokasi;
    private String kodelokasi;
    
    public LokasiAset (String kodelokasi, String namalokasi) {
        this.namalokasi=namalokasi;
        this.kodelokasi=kodelokasi;
}

    public String getNamalokasi() {
        return namalokasi;
    }

    public void setNamalokasi(String namalokasi) {
        this.namalokasi = namalokasi;
    }

    public String getKodelokasi() {
        return kodelokasi;
    }

    public void setKodelokasi(String kodelokasi) {
        this.kodelokasi = kodelokasi;
    }
    

    @Override
    public String toString() {
        return namalokasi;
    }
    
    
}
