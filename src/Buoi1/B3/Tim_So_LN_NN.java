package Buoi1.B3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tim_So_LN_NN {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
         int a, b, n, temp;
         double negativeMax = Double.NEGATIVE_INFINITY;
         double positiveMin = Double.POSITIVE_INFINITY;
         a = input.nextInt();
         b = input.nextInt();
         n = input.nextInt();
         while(n>0){
             temp = random.nextInt(b-a)+a;
             arr.add(temp);
             n-=1;
         }
         for(Integer integer:arr){
             System.out.println(integer);
             if(integer > negativeMax && integer < 0 ) negativeMax = integer;
             if(integer < positiveMin && integer > 0) positiveMin = integer;
         }
         if(negativeMax == Double.NEGATIVE_INFINITY || a >= 0){
             System.out.printf("Khong co so am lon nhat ");
         }else {
             System.out.println("So am lon nhat la :" + negativeMax);
         }
         if(positiveMin == Double.POSITIVE_INFINITY || b <= 0){
             System.out.printf("Khong co so duong nho nhat");
         } else {
             System.out.println("\nSo duong nho nhat la :" + positiveMin);
         }
    }
}
