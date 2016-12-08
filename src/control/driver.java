/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.*;

/**
 *
 * @author agungrb
 */
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pengguna p = new Pengguna("Admin","admin","admin");
        Aplikasi app = new Aplikasi();
        app.addPengguna(p);
        app.addLokasiAset(new LokasiAset("-","-"));
        app.addLokasiAset(new LokasiAset("GSG","Gd Serba Guna"));
        app.addLokasiAset(new LokasiAset("GDA","Gd E"));
        app.addLokasiAset(new LokasiAset("GDB","Gd F"));
        app.addBarang(new Barang(app.getKodeBarang(),"Vixion","agung",10,"Kendaraan",100,app.listLokasi.get(0)));
        app.listBarang.get(0).addRiwayat(new Riwayat(p,"Input data"));
        app.addLahan(new Lahan("10 hektar",app.getKodeLahan(),"Tanah sawah","Kampus","Hibah",200));
        Controller c = new Controller(app);
    }
    
}
