package com.mycompany.bai_lay_diem_cong;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TuyenSinh  {
    static Scanner sc = new Scanner(System.in);
    private final List<Thi_Sinh> danhsachTS = new ArrayList<>();

    

    
    public TuyenSinh(){
        danhsachTS = new ArrayList<>();
    }
    
    public static void main(String[] args) {

        TuyenSinh a = new TuyenSinh();
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
                    NhapMang(ts);
                    break;
                case 2:
                    XuatMang(ts);
                    break;
                case 3:
                    TimTS(ts);
                    break;
                default:
                    System.out.println("Sai. Lam lai");
            }
        } while (chon != 0);
        if (danhsachTS.isEmpty()) {
            System.out.println("Danh sach trong. Vui long nhap thong tin truoc.");
            continue;
        }
        
    }
    
    public static void NhapMang (Thi_Sinh[] ts){
        int khoi, n;
        
        System.out.println("Nhập n: ");
        n = sc.nextInt();
        List<Thi_Sinh> tsList = new ArrayList<>();

            System.out.println("Vui long chon Khoi");
            System.out.println("1 - Khoi A");
            System.out.println("2 - Khoi B");
            System.out.println("3 - Khoi C");
            khoi = sc.nextInt();
            sc.nextLine();
            Thi_Sinh tuyensinh ;
            switch (khoi) {
                case 1:
                    tuyensinh = new KhoiA();
                    break;
                case 2:
                    tuyensinh = new KhoiB();
                    break;
                case 3:
                    tuyensinh = new KhoiC();
                    break;
                default:
                    System.out.println("Sai, làm lại");
            } 

            tuyensinh.Nhap();
            danhsachTS.add(tuyensinh);
        }
    }
    
    public static void XuatMang (Thi_Sinh[] ts){
        for (int i = 0; i < ts.length; i++) {
            ts[i].Xuat();
        }
    }
    
    public static void TimTS (Thi_Sinh[] ts) {
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
