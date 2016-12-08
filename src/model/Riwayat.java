/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author agungrbudiman
 */
public class Riwayat {
    private Pengguna pengguna;
    private String detail;
    private Date tanggal = new Date();

    public Riwayat(Pengguna pengguna, String detail) {
        this.pengguna = pengguna;
        this.detail = detail;
    }
}
