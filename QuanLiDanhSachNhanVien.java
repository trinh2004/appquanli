package edu.poly.appquanli;

import com.sun.source.tree.NewClassTree;
import static edu.poly.appquanli.NhanVien.s;
import java.util.ArrayList;
import java.util.List;

public class QuanLiDanhSachNhanVien {

    private static ArrayList<NhanVien> list = new ArrayList<>();

    public static void menuQuanLiNhanVien() {
        int chose = 0;
        do {
            System.out.println("chào mừng đến với chương trình quản lí nhân viên");
            System.out.println("0.exit");
            System.out.println("1.input danh sach nhan vien");
            System.out.println("2.output danh sach nhan vien");
            System.out.println("3.tim kiem nhan vien trong danh sach");
            System.out.println("4.tim kiem nhan vien luong cao nhat");
            System.out.println("5.tim va xoa nhan vien");
            System.out.println("6.update nhan vien");
            System.out.println("7.xoa nhan vien");
            try {
                System.out.println("Mời nhập lựa chọn");
                chose = Integer.parseInt(s.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập từ 1 đến 7 để thực hiện chức năng"
                        + "Nhập 0 để thoát");
            }
            switch (chose) {
                case 0:
                    System.exit(chose);
                    break;
                case 1:
                    inputDSNV();
                    break;
                case 2:
                    outputDSNV();
                    break;
                case 3:
                    timKiemNV();
                    break;
                case 4:
                    timKiemNhanVienMaxLuong();
                    break;
                case 5:
                    timVaXoaNhanVien();
                    break;
                case 6:
                    updateNV();
                    break;
                case 7:
                    timVaXoaNhanVien();
                    break;

            }
        } while (chose != 0);
    }

    public static void inputDSNV() {
        int so;
        int chose;
        System.out.println("Mời nhập số lượng ");
        so = (Integer.parseInt(s.nextLine()));
        for (int i = 0; i < so; i++) {
            System.out.println("Chọn loại nhân viên");
            System.out.println("1.Hành chánh");
            System.out.println("2.Tiếp thị");
            System.out.println("3.Trưởng phòng");
            chose = s.nextInt();
            s.nextLine();
            switch (chose) {
                case 1 -> {
                    HanhChinh nvhc = new HanhChinh();
                    nvhc.input();
                    list.add(nvhc);
                }

                case 2 -> {
                    TiepThi nvtt = new TiepThi();
                    nvtt.input();
                    list.add(nvtt);
                }
                case 3 -> {
                    TruongPhong tp = new TruongPhong();
                    tp.input();
                    list.add(tp);
                }
            }
        }
    }

    public static void outputDSNV() {
        for (NhanVien x : list) {
            x.output();
        }
    }

    public static void timKiemNV() {
        String ma;
        System.out.println("Vui long nhap ma nv");
        ma = s.nextLine();
        for (NhanVien x : list) {
            if (x.getId().equalsIgnoreCase(ma)) {
                System.out.println("ĐÃ TÌM THẤY NHÂN VIÊN :");
                x.output();
            } else {
                System.out.println("không tìm thấy nhân viên có mã :" + ma);
                break;
            }
        }
    }

    public static void timKiemNhanVienMaxLuong() {
        double luong = 0;
        NhanVien a = null;
        for (NhanVien x : list) {
            if (x.getSalary() > luong) {
                luong = x.getSalary();
                a = x;
            }
        }
        if (a != null) {
            System.out.println("đã tìm thấy nhân viên lương cao nhất là");
            a.output();
        } else {
            System.out.println("Không tìm thấy nhân viên vào lương cao nhất");
        }
    }

    public static void updateNV() {
        System.out.println("Cập nhật thông tin nhân viên theo mã");
        System.out.println("Nhập mã nhân viên");
        String ma = s.nextLine();
        for (int i = 0; i < list.size(); i++) {
            var temp = list.get(i);
            if (temp.getId().equalsIgnoreCase(ma)) {
                System.out.println("Nhập thông tin cập nhật");

                if (temp.getClass() == HanhChinh.class) {  // chuyển đổi qua nhân viên hành chánh
//                    HanhChanh hc = new HanhChanh();
                    //nhập thông tin của nhân viên hành chánh
                    ((HanhChinh) temp).input();
                    list.set(i, temp);
                } else if (temp.getClass() == TruongPhong.class) {// chuyển đổi qua nhân viên trưởng phòng
//                    TruongPhong tp = new TruongPhong();
                    ((TruongPhong) temp).input();//nhập thông tin của nhân viên trưởng phòng
                    list.set(i, temp);
                } else if (temp.getClass() == TiepThi.class) {// chuyển đổi qua nhân viên tiếp thị
//                    TiepThi tp = new TiepThi();
                    ((TiepThi) temp).input();//nhập thông tin của nhân viên tiếp thị 
                    list.set(i, temp);
                }
            }
        }
    }

    public static void timVaXoaNhanVien() {
        System.out.println("Vui lòng nhập mã ");
        String ma;
        ma = s.nextLine();
        for (NhanVien x : list) {
            if (x.getId().equalsIgnoreCase(ma)) {
                System.out.println("đã tìm thấy nhân viên:");
                x.output();
                System.out.println("Bạn có chắc muốn xóa nhân viên này vui lòng nhập y/n");
                String chose;
                chose = s.nextLine();
                if (chose.equalsIgnoreCase("y")) {
                    list.remove(x);
                } else {
                    System.out.println("cảm ơn bạn đã sử dụng chương trình");
                }
                System.exit(0);
            } else {
                System.out.println("Không tìm thấy nhân viên nào");
            }
        }
    }

}
