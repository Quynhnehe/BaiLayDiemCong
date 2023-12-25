/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai_lay_diem_cong;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Thi_Sinh {
    // Khai báo thuộc tính 
    private int sbd;
    private String hoten;
    private String diachi;
    private int uutien;
    Scanner sc = new Scanner (System.in);
    
    
    public Thi_Sinh () {

        
    }
    
    //setter và getter
    public void setsbd (int sbd){
        this.sbd = sbd;
    }
    public void sethoten ( String hoten){
        this.hoten = hoten ;
    }
    public void setdiachi (String diachi){
        this.diachi = diachi ; 
    }
    public void setuutien (int uutien) {
        this.uutien = uutien;
    }
    
    public int getsbd () {
        return this.sbd;
    }
    public String gethoten () {
        return this.hoten;
    }
    public String getdiachi () {
        return this.diachi ;
    }
    public int getuutien () {
        return this.uutien;
    }
    
    void Nhap() {
        System.out.println("Nhap So bao danh: ");
        this.setsbd(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Ho va Ten: ");
        this.sethoten(sc.nextLine());
        System.out.println("Nhap Dia chi: ");
        this.setdiachi(sc.nextLine());
        System.out.println("Nhap Uu Tien: ");
        this.setuutien(sc.nextInt());
    }
    void Xuat (){
            System.out.println(this.sbd+"-"+this.hoten+"-"+this.diachi+"-"+this.uutien);
    }

    
}
