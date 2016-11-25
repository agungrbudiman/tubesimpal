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
public class Pengguna {
    private String namaUser;
    private String username;
    private String password;
    private String alamatUser;
    private String emailUser;

    public Pengguna(String namaUser, String username, String password) {
        this.namaUser = namaUser;
        this.username = username;
        this.password = password;
    }

    
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNamaUser() {
        return namaUser;
    }

}
