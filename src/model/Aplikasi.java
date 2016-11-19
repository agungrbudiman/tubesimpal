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
    
    public Aplikasi() {
        listLokasi = new ArrayList();
        listLahan = new ArrayList();
        listBarang = new ArrayList();
        listPengguna = new ArrayList();
    }
    
    public void addLahan(Lahan lahan) {
        listLahan.add(lahan);
    }
    
    public void addBarang(Barang barang) {
        listBarang.add(barang);
    }
    
    public void addLokasiAset(LokasiAset lokasi) {
        listLokasi.add(lokasi);
    }
    
    public void addPengguna(Pengguna p) {
        listPengguna.add(p);
    }
    
    public Pengguna cariPengguna(String username, String password) {
        for (Pengguna p : listPengguna) {
            if()
        }
    }
    
    public Barang searchBarang(String kodeaset) {
        for (LokasiAset l : listLokasi) {
            
        }
        return null;
    }
    
}
