package Buoi3.B1;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    String hoten;
    int namsinh;
    ArrayList<Integer> scores;

    public Person(String hoten, int namsinh, ArrayList<Integer> scores) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.scores = scores;
    }

    public double averageScore(){
        int sum = 0;
        for (int score : scores){
            sum += score;
        }
        return (double) sum / scores.size();
    }

    public void luanVan(){
        double average = averageScore();
        boolean diemTren5 = scores.stream().allMatch(score -> score >= 5);
        if(average > 7 && diemTren5){
            System.out.println("Du dieu kien lam luan van");
        } else {
            System.out.println("Khong du dieu kien lam luan van");
        }
    }

    public void totNghiep(){
        double average = averageScore();
        boolean diemTren5 = scores.stream().allMatch(score -> score >= 5);
        if(average <= 7 && diemTren5){
            System.out.println("Du dieu kien thi tot nghiep");
        } else {
            System.out.println("Khong du dieu kien thi tot nghiep");
        }
    }
    public void thiLai(){
        boolean diemTren5 = scores.stream().allMatch( score -> score >=5 );
        if(!diemTren5){
            System.out.println("Thi lai");
        } else {
            System.out.println("Khong phai thi lai");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten sv: ");
        String hoten = input.nextLine();
        System.out.print("Nhap nam sinh sv: ");
        int namsinh = input.nextInt();
        ArrayList<Integer> scores = new ArrayList<>();
        System.out.println("Nhap diem cho tung mon hoc: ");
        for(int i = 1; i <= 9; i ++){
            System.out.print("Nhap diem mon " +i+ ": ");
            int score = input.nextInt();
            scores.add(score);
        }
        Person student = new Person(hoten, namsinh, scores);
        student.luanVan();
        student.totNghiep();
        student.thiLai();
    }
}
