package Buoi4.B1;

import java.util.Scanner;

public class Circle extends Shape {
    private float r;
    @Override
    public void tinhDienTich(){
        System.out.println("**************Hinh tron**************");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ban kinh r: ");
        r = input.nextFloat();
        float S = (float) (Math.PI*r*r);
        System.out.println("Dien tich hinh tron la: "+S);
    }
}
