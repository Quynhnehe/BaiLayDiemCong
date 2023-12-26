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
public class KhoiB extends KhoiA{
    private int Sinh;
    Scanner sc = new Scanner(System.in);
    
    public KhoiB() {
        super(false);
    }
   // setter và getter
    public void setSinh (int Sinh){
        this.Sinh = Sinh;
    }
    
    public int getSinh () {
        return this.Sinh;
    }
    
    public void Nhap() {
        super.Nhap(); 
        System.out.println("Nhap diem Sinh: ");
        setSinh(sc.nextInt());
        sc.nextLine();
    }
    
    
    
    
}
