import java.util.ArrayList;
import java.util.Scanner;

public class Slide112 {
    Scanner sc = new Scanner(System.in);
    ArrayList<SinhVien> sinhVien = new ArrayList<>();
    int a = 1;
    while (a==1){
        System.out.println("\n1.Them sinh vien");
        System.out.println("2.Hien thi sinh vien");
        System.out.println("3.Dem so sinh vien thi lai va hien thi ");
        System.out.println("4.Hien thi cac sinh vien co diem cao nhat");
        System.out.println("5.Tim kiem");
        int luachon;
        do{
            System.out.println("Nhap vao lua chon :");
            luachon = sc.nextInt();
        }while((luachon<0)||(luachon>5));
        switch(luachon)
        case 1:
        SinhVien.ThemSinhVien(sinhVien);
        break;
        case 2:
        SinhVien.HienThiSinhVien(sinhVien);
        break;
        case 3:
        SinhVien.DemSinhVien(sinhVien);
        break;
        case 4:
        SinhVien.maxSinhVien(sinhVien);
        break;
        case 5:
        SinhVien.TimkiemSinhVien(sinhVien);
        break;
    }
    } 

