package edu.poly.appquanli;

import java.util.Scanner;

public class NhanVien {

    static Scanner s = new Scanner(System.in);
    private String id;
    private String name;
    private String address;
    private double salary;

    public NhanVien(String id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public NhanVien() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        try {
                    System.out.println("Mời nhập mã nhân viên");
        id = s.nextLine();
        System.out.println("Mời nhập tên nhân viên");
        name = s.nextLine();
        System.out.println("Mời nhập địa chỉ nhân viên");
        address = s.nextLine();
        System.out.println("Mời nhập lương nhân viên");
        salary = Double.parseDouble(s.nextLine());
        } catch (Exception e) {
            System.out.println("Vui lòng nhập đúng định dạng !, nhập lại đi bro");
        }

    }

    public void output() {
        System.out.println("Mã nhân viên :" + id + "Tên nhân viên :" + name + "địa chỉ :" + address
                + "salary :" + salary);
    }
}
