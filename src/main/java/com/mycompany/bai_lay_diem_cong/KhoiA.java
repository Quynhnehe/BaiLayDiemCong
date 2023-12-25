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
public class KhoiA extends Thi_Sinh {
    public Scanner sc = new Scanner(System.in);
    
    private int Toan;
    private int Ly;
    private int Hoa;
    private boolean isA;
    public KhoiA() {
        isA = true;
    }
    public KhoiA(boolean b) {
        isA = b;
    }
   // setter và getter
    public void setToan (int Toan){
        this.Toan = Toan;
    }
    public void setLy (int Ly){
        this.Ly = Ly;
    }
    public void setHoa (int Hoa){
        this.Hoa = Hoa;
    }
    
    public int getToan () {
        return this.Toan;
    }
    public int getLy () {
        return this.Ly;
    }
    public int getHoa () {
        return this.Hoa;
    }
    
    public void Nhap() {
        super.Nhap(); 
        System.out.println("Nhap diem Toan: ");
        setToan(sc.nextInt());
        if (isA) {
            System.out.println("Nhap diem Ly: ");
            setToan(sc.nextInt());
        }
        System.out.println("Nhap diem Hoa");
        setHoa(sc.nextInt());
        sc.nextLine();
    }
    
    
    
}
