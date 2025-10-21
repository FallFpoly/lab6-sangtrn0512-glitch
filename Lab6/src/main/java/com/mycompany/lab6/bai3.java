/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.ArrayList;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        ArrayList<SinhVien> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("nhap sinh vien thu" + i);
            SinhVien sv = new SinhVien();
            sv.nhap();
            list.add(sv);
        }
    }
}
