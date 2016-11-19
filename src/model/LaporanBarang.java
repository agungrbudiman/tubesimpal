/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
//Baykus
/**
 *
 * @author agungrb
 */
public class LaporanBarang {
    private String periodeLaporan;
    private Barang DataAset; 
    
    public void viewLaporan(){
        
    }

    public String getPeriodeLaporan() {
        return periodeLaporan;
    }

    public void setPeriodeLaporan(String periodeLaporan) {
        this.periodeLaporan = periodeLaporan;
    }

    public Barang getDataAset() {
        return DataAset;
    }

    public void setDataAset(Barang DataAset) {
        this.DataAset = DataAset;
    }
    
}
