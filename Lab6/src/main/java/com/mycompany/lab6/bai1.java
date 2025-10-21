/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten");
        String hoTen = sc.nextLine();

        String ho = hoTen.substring(0, hoTen.indexOf(" "));
        String tenDem = hoTen.substring(hoTen.indexOf(" ") + 1, hoTen.lastIndexOf(" "));
        String ten = hoTen.substring(hoTen.lastIndexOf(" ") + 1);

        System.out.println(ho.toUpperCase() + tenDem + ten.toUpperCase());
    }
}
