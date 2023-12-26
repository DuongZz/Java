package Buoi2.B1;

import java.util.Scanner;

public class Cylinder {
    double r;
    double h;

    public Cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }
    public double getS(){
        return 2*Math.PI*this.r*(this.r+this.h);
    }
    public double getV(){
        return Math.PI*this.r*this.r*this.h;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double h = input.nextDouble();

        Cylinder cylinder = new Cylinder(r, h);
        double S = cylinder.getS();
        System.out.println("Dien tich:" + S);
        double V = cylinder.getV();
        System.out.println("The tich:" + V);
    }
}