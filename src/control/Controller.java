/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Aplikasi;
import model.Pengguna;
import view.*;

/**
 *
 * @author agungrb
 */
public class Controller implements ActionListener {

    private Aplikasi app;
    private View view;
    private Pengguna session;
    
    public Controller(Aplikasi app) {
        this.app = app;
        session = null;
    }
    
    private void halamanutama() {
        ViewHalamanUtama x = new ViewHalamanUtama();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void login() {
        ViewLogin x = new ViewLogin();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void mutasidata() {
        ViewMutasiData x = new ViewMutasiData();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void olahdata() {
        ViewOlahData x = new ViewOlahData();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    private void pelaporan() {
        ViewPelaporan x = new ViewPelaporan();
        x.setVisible(true);
        x.addListener(this);
        view = x;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(view instanceof ViewLogin) {
            ViewLogin x = (ViewLogin) view;
            if(source.equals(x.getBtnLogin())) {
                String username = x.getTxFieldUsername();
                String psw = x.getTxFieldPassword();
                for (Pengguna p : app.listPengguna) {
                    if(username.equals(p.getUsername()) && psw.equals(p.getPassword())) {
                        session = p;
                        halamanutama();
                        x.dispose();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Pengguna tidak ditemukan");
                    }
                }
            }
        }
        else if(view instanceof ViewHalamanUtama){
            
        }
        else if(view instanceof ViewMutasiData) {
            
        }
        else if(view instanceof ViewOlahData) {
            
        }
        else if(view instanceof ViewPelaporan) {
            
        }
    }
    
}
