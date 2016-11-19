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
    
    public void addLahan(Lahan lahan) {
        listLahan.add(lahan);
    }
    
    public void addBarang(Barang barang) {
        listBarang.add(barang);
    }
    
    public void addLokasiAset(LokasiAset lokasi) {
        listLokasi.add(lokasi);
    }
    
    public Barang searchBarang(String kodeaset) {
        for (LokasiAset l : listLokasi) {
            
        }
        return null;
    }
    
}
