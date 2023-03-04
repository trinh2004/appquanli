package edu.poly.appquanli;


import java.util.Scanner;

public class Appquanli {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int chose = 0;
        do {
            System.out.println("Mời bạn chọn chương trình quản lí ");
            System.out.println("0.exit");
            System.out.println("1.CHƯƠNG TRÌNH QUẢN LÍ NHÂN VIÊN");
            System.out.println("2.CHƯƠNG TRÌNH QUẢN LÍ QUÁN NHẬU");
            System.out.println("3.CHƯƠNG TRÌNH QUẢN LÍ SINH VIÊN");
            System.out.println("4.CHƯƠNG TRÌNH QUẢN LÍ HỌC SINH");
            System.out.println("5.CHƯƠNG TRÌNH QUẢN LÍ RẠP CHIẾU PHIM");
            System.out.println("Mời bạn nhập số");
            try {
                chose = Integer.parseInt(s.nextLine());
            } catch (Exception e) {
                System.out.println("VUI lòng nhập 1 đến 4 để thực hiện chức năng"
                        + ", NHẬP 0 ĐỂ THOÁT");
            }
            switch (chose) {
                case 0:
                    System.exit(chose);
                    break;
                case 1:
                    QuanLiDanhSachNhanVien.menuQuanLiNhanVien();
                    break;
                case 2:
                    quanLiQuanNhau();
                    break;
                case 3:
                    quanLiSinhVien();
                    break;
                case 4:
                    quanLiHocSinh();
                    break;
                case 5:
                    quanLiRapChieuPhim();
                    break;
                default:
                    System.out.println("Vui Lòng nhập từ 1 đến 5 để sử dụng chương trình");
                    break;
            }
        } while (chose != 0);
    }


    
 
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void quanLiQuanNhau() {
        System.out.println("chào mừng đến với chương trình quản lí quán nhậu");
    }

    public static void quanLiSinhVien() {
        System.out.println("chào mừng đến với chương trình quản lí sinh viên");
    }

    public static void quanLiHocSinh() {
        System.out.println("chào mừng đến với chương trình quản lí học sinh");
    }

    public static void quanLiRapChieuPhim() {
        System.out.println("chào mừng đến với chương trình quản lí rạp chiếu phim");
    }
}
