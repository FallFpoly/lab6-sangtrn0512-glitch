/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author sang
 */
public class SanPham {
    String tenSP;
    double donGia;
    String hang;

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten sp");
        tenSP = sc.nextLine();
        System.out.println("nhap don gia");
        donGia = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap ten hang");
        hang = sc.nextLine();
    }

    public void xuat() {
        System.out.println("ten sp : " + tenSP);
        System.out.println("don gia : " + donGia);
        System.out.println("ten hang : " + hang);
    }
}
