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
public class KhoiC extends Thi_Sinh{
    private int Van;
    private int Su;
    private int Dia;
    Scanner sc = new Scanner(System.in);
    
    public KhoiC() {
    }
   // setter và getter
    public void setVan (int Van){
        this.Van = Van;
    }
    public void setSu (int Su){
        this.Su = Su;
    }
    public void setDia (int Dia){
        this.Dia = Dia;
    }
    
    public int getVan () {
        return this.Van;
    }
    public int getSu () {
        return this.Su;
    }
    public int getDia () {
        return this.Dia;
    }
    
    public void Nhap() {
        super.Nhap(); 
        System.out.println("Nhap diem Van: ");
        setVan(sc.nextInt());
        System.out.println("Nhap diem Su: ");
        setSu(sc.nextInt());
        System.out.println("Nhap diem Dia");
        setDia(sc.nextInt());
        sc.nextLine();
    }
    
    
    
}
