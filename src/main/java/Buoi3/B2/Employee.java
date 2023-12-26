package Buoi3.B2;

import java.util.Scanner;

public class Employee {
    String hoten;
    String cmnd;

    public Employee(String hoten, String cmnd){
        this.hoten = hoten;
        this.cmnd = cmnd;
    }

    public static class EmployeeInfo {
        public String hoten;
        public String cmnd;
    }

    public static EmployeeInfo Nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoten = input.nextLine();
        System.out.print("Nhap cmnd: ");
        String cmnd = input.nextLine();

        EmployeeInfo info = new EmployeeInfo();
        info.hoten = hoten;
        info.cmnd = cmnd;

        return info;
    }

    public void Xuat(){
        System.out.println("Ten: " + this.hoten + "\nSo cmnd: " + this.cmnd);
    }

    public static void main(String[] args) {
        EmployeeInfo info = Nhap();
        Employee employee = new Employee(info.hoten, info.cmnd);
        employee.Xuat();
    }
}
