package Buoi1.B1;

import java.util.Scanner;

public class Mau_Chung_Nho_Nhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,i,min;
        System.out.print("Input a and b: ");
        a = input.nextInt();
        b = input.nextInt();
        min= Math.min(a, b);
        for(i=2;i<min;i++) {
            if (((a%i)==0)&&((b%i)==0)) break;
        }
        if(i==min) {
            System.out.println("There is no minimum common pattern");
        } else {
            System.out.println("Minimum common pattern is:" + i);
        }
    }
}
