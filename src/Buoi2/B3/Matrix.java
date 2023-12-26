package Buoi2.B3;

import java.util.Scanner;

public class Matrix {
    public static void inputMatrix(int a[][], int n, int m) {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("a["+i+","+j+"] =");
                a[i][j] = input.nextInt();
            }
        }
    }
    public static void xuatMatrix(int a[][], int n, int m){
        for(int i = 0;i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void tongMatrix (int a[][], int b[][], int c[][], int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0;j < m; j++){
                c[i][j]= a[i][j] + b[i][j];
                System.out.print(+c[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    public static void hieuMatrix (int a[][], int b[][], int c[][], int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0;j < m; j++){
                c[i][j]= a[i][j] - b[i][j];
                System.out.print(+c[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    public static void tichMatrix (int a[][], int b[][], int c[][], int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0;j < m; j++){
                c[i][j]= a[i][j] * b[i][j];
                System.out.print(+c[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so hang:");
        int n = input.nextInt();
        System.out.print("Nhap so cot:");
        int m = input.nextInt();
        System.out.println("Nhap mang A:");
        int a[][] = new int [n][m];
        inputMatrix(a, n, m);
        System.out.println("Mang A:");
        xuatMatrix(a, n, m);
        System.out.println("Nhap mang B:");
        int b[][] = new int [n][m];
        inputMatrix(b, n, m);
        System.out.println("Mang B:");
        xuatMatrix(b, n, m);
        int c[][] = new int [n][m];
        System.out.println("Tong 2 mang A va B:");
        tongMatrix(a, b, c, n, m);
        System.out.println("Hieu 2 mang A va B:");
        hieuMatrix(a, b, c, n, m);
        System.out.println("Tich 2 mang A va B:");
        tichMatrix(a, b, c, n, m);
    }
}