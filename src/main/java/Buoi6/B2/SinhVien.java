package Buoi6.B2;

import java.util.Scanner;

public class SinhVien {
    protected String name;
    protected String birthday;
    protected String birthplace;
    Scanner input = new Scanner(System.in);

    public SinhVien(String name, String birthday, String birthplace){
        this.name = name;
        this.birthday = birthday;
        this.birthplace = birthplace;
    }
    public void setName(){
        System.out.print("Nhập tên sinh viên: ");
        name = input.nextLine();
    }
    public String getName(){
        return name;
    }
    public void setBirthday(){
        System.out.print("Nhập ngày sinh sinh viên: ");
        birthday = input.nextLine();
    }
    public String getBirthday(){
        return birthday;
    }
    public void setBirthplace(){
        System.out.print("Nhập quê quán sinh viên: ");
        birthplace = input.nextLine();
    }
    public String getBirthPlace(){
        return birthplace;
    }

}
