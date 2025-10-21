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
public class SinhVien {
    String hoTen;
    String email;
    String sdt;
    String CMND;

    public void nhap() {
        String regexEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        String regexSdt = "0\\d{9}";
        String regexCMND = "\\d{9}||\\\\d{12}";
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten");
        hoTen = sc.nextLine();
        do {
            System.out.println("nhap emai");
            email = sc.nextLine();
            if (!email.matches(regexEmail)) {
                System.out.println("email ko dung vui long nhap lai");
            }
        } while (!email.matches(regexEmail));
        do {
            System.out.println("nhap sdt");
            sdt = sc.nextLine();
            if (!sdt.matches(regexSdt)) {
                System.out.println("sdt ko dung vui long nhap lai");
            }
        } while (!sdt.matches(regexSdt));

        do {
            System.out.println("nhap CMND");
            CMND = sc.nextLine();
            if (!CMND.matches(regexCMND)) {
                System.out.println("cmnd ko dung nhap lai");
            }
        } while (!CMND.matches(regexCMND));

    }
}
