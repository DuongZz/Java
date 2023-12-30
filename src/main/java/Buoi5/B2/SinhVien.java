package Buoi5.B2;

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
    public void getName(){
        System.out.println(name);
    }
    public void setBirthday(){
        System.out.print("Nhập ngày sinh sinh viên: ");
        birthday = input.nextLine();
    }
    public void getBirthday(){
        System.out.println(birthday);
    }
    public void setBirthplace(){
        System.out.print("Nhập quê quán sinh viên: ");
        birthplace = input.nextLine();
    }
    public void getBirthPlace(){
        System.out.println(birthplace);
    }

    public static void main(String[] args) {
        CuuSinhVien csv = new CuuSinhVien("", "", "");
        SinhVienNganhCo svnc = new SinhVienNganhCo("", "", "");
        SinhVienNganhDien svnd = new SinhVienNganhDien("", "", "");

        System.out.println(">>>>>>Nhập thông tin cựu sinh viên: ");
        csv.setName();
        csv.setBirthday();
        csv.setBirthplace();
        System.out.println(">>>>>>Thông tin cựu sinh viên : ");
        csv.getName();
        csv.getBirthday();
        csv.getBirthPlace();

        System.out.println(">>>>>>Nhập thông tin sinh viên ngành cơ: ");
        svnc.setName();
        svnc.setBirthday();
        svnc.setBirthplace();
        System.out.println(">>>>>>Thông tin sinh viên ngành cơ: ");
        svnc.getName();
        svnc.getBirthday();
        svnc.getBirthPlace();

        System.out.println(">>>>>>Nhập thông tin sinh viên ngành điện: ");
        svnd.setName();
        svnd.setBirthday();
        svnd.setBirthplace();
        System.out.println(">>>>>>Thông tin sinh viên ngành điện: ");
        svnd.getName();
        svnd.getBirthday();
        svnd.getBirthPlace();
    }
}
