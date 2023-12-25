package com.mycompany.bai_lay_diem_cong;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Bai_lay_diem_cong {
    static Scanner sc = new Scanner(System.in);
    private final List<Thi_Sinh> danhsachTS;
    public void Bai_lay_diem_cong(){
        danhsachTS = new ArrayList<>();
    }
    public static void main(String[] args) {
        Bai_lay_diem_cong a = new Bai_lay_diem_cong();
        a.menu();
    }
    
    public void menu(){
        int chon;
         do {
            System.out.println("0 - Thoat");
            System.out.println("1 - Nhap");
            System.out.println("2 - Xuat");
            System.out.println("3 - Tim kiem");
            System.out.println("Moi ban chon ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 0:                    
                    break;
                case 1:
                    NhapMang();
                    break;
                case 2:
                    XuatMang(danhsachTS);
                    break;
                case 3:
                    TimTS(danhsachTS);
                    break;
                default:
                    System.out.println("Sai. Lam lai");
            }
        } while (chon != 0);
    }
    
    public static void NhapMang (){
        int khoi;
            System.out.println("Vui long chon Khoi");
            System.out.println("1 - Khoi A");
            System.out.println("2 - Khoi B");
            System.out.println("3 - Khoi C");
            khoi = sc.nextInt();
            sc.nextLine();
            Thi_Sinh ts;
            switch (khoi) {
                case 1:
                    ts = new KhoiA();
                    break;
                case 2:
                    ts = new KhoiB();
                    break;
                case 3:
                    ts = new KhoiC();
                    break;
                default:
                    System.out.println("Sai, làm lại");
            }
            ts.Nhap();
              danhsachTS.add(ts);
        }
    }
    
    public static void XuatMang (danhsachTS ts){
        for (int i = 0; i < ts.length; i++) {
            ts[i].Xuat();
        }
    }
    
    public static void TimTS (danhsachTS ts) {
        boolean flag = false;
        sc.nextLine();
        System.out.println("Nhap ten thi sinh can tim: ");
        String tam = sc.nextLine();
        for (int i = 0; i < ts.length; i++) {
            if (ts[i].gethoten ().compareToIgnoreCase(tam) ==0)
            {
                ts[i].Xuat();
                flag = true;
            }
        }
        if (flag == false){
            System.out.println("Không tìm thấy thí sinh");
        }
    }
}
