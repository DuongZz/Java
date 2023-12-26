package Buoi4.B1;

import java.util.Scanner;

public class Rectangle extends Shape {
    private float a;
    private float b;
    @Override
    public void tinhDienTich(){
        System.out.println("**************Hinh chu nhat**************");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai a: ");
        a = input.nextFloat();
        System.out.print("Nhap chieu rong b: ");
        b = input.nextFloat();
        float S = a*b;
        System.out.println("Dien tich hinh chu nhat la: "+S);
    }
}
