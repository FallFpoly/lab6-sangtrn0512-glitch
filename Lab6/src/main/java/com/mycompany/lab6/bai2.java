/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.ArrayList;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        ArrayList<SanPham> listSP = new ArrayList<SanPham>();
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            listSP.add(sp);
        }
        for (SanPham x : listSP) {
            if (x.hang.equals("Nokia")) {
                x.xuat();
            }
        }
    }
}
