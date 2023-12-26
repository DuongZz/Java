package Buoi4.B1;

import Buoi4.B1.Shape;

import java.util.Scanner;

public class Triangle extends Shape {
    private float a;
    private float h;

    @Override
    public void tinhDienTich() {
        System.out.println("**************Hinh tam giac**************");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu dai canh day a: ");
        a = input.nextFloat();
        System.out.print("Nhap chieu cao h: ");
        h = input.nextFloat();
        float S = (float) ((a*h)*0.5);
        System.out.println("Dien tich tam giac: "+S);
    }
}
