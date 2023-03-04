package edu.poly.appquanli;

import java.util.Scanner;

public class TiepThi extends NhanVien {

    private double hoaHong;
    private double doanhThu;

    public TiepThi(String id, String name, String address, double salary, double hoaHong, double doanhThu) {
        super(id, name, address, salary);
        this.hoaHong = hoaHong;
        this.doanhThu = doanhThu;
    }

    public double getHoaHong() {
        return hoaHong;
    }

    public TiepThi() {
    }

    public void setHoaHong(double hoaHong) {
        this.hoaHong = hoaHong;
    }

    public double getThuNhap() {
        return doanhThu;
    }

    public void setThuNhap(double thuNhap) {
        this.doanhThu = doanhThu;
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Mời nhập hoa hồng");
        hoaHong = Double.parseDouble(s.nextLine());
        System.out.println("Mời nhập thu nhập ");
        doanhThu = Double.parseDouble(s.nextLine());
    }
    @Override
    public void output(){
        super.output();
        try {
        System.out.println("Hoa hồng :"+hoaHong);
        System.out.println("Thu nhập :"+doanhThu);
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số");
        }

    }
}
