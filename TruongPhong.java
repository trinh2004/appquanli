package edu.poly.appquanli;

public class TruongPhong extends NhanVien {

    private double luongTrachNhiem;

    public TruongPhong(String id, String name, String address, double salary, double luongTrachNhiem) {
        super(id, name, address, salary);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public TruongPhong() {
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public void input() {
        super.input();
        try {
            System.out.println("Mời nhập lương trách nhiệm");
            luongTrachNhiem = Double.parseDouble(s.nextLine());
        } catch (Exception e) {
            System.out.println("Vui lòng nhập số");
        }
    }

    @Override
    public void output() {
        super.output();
        System.out.println("luong trach nhiem" + luongTrachNhiem);
    }

}
