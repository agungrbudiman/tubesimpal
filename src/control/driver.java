/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.text.SimpleDateFormat;
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
        Aplikasi app = new Aplikasi();
        app.addPengguna(new Pengguna("Agung","agung","agung"));
        app.addPengguna(new Pengguna("Admin","admin","admin"));
        app.addLokasiAset(new LokasiAset("-","-"));
        app.addLokasiAset(new LokasiAset("GSG","Gd Serba Guna"));
        app.addLokasiAset(new LokasiAset("GDA","Gd E"));
        app.addLokasiAset(new LokasiAset("GDB","Gd F"));
        
        app.addBarang(new Barang(app.getKodeBarang(),"Vixion","agung",10,"Kendaraan",100,app.listLokasi.get(0)));
        app.listBarang.get(0).addRiwayat(new Riwayat(app.listPengguna.get(0),"input data baru"));
        app.listBarang.get(0).addRiwayat(new Riwayat(app.listPengguna.get(0),"update data"));
        app.listBarang.get(0).addRiwayat(new Riwayat(app.listPengguna.get(1),"mutasi data"));
        
        try {
            app.listBarang.get(0).getRiwayat().get(0).setTanggal(new SimpleDateFormat("dd-MM-yyyy").parse("15-11-2016"));  
            app.listBarang.get(0).getRiwayat().get(1).setTanggal(new SimpleDateFormat("dd-MM-yyyy").parse("5-12-2016"));   
            app.listBarang.get(0).getRiwayat().get(2).setTanggal(new SimpleDateFormat("dd-MM-yyyy").parse("10-12-2016"));   
        } catch (Exception e) {
        }
        
        app.addLahan(new Lahan("10 hektar",app.getKodeLahan(),"Tanah sawah","Kampus","Hibah",200));
        Controller c = new Controller(app);
    }
    
}
