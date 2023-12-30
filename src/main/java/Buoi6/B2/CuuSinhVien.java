package Buoi6.B2;

public class CuuSinhVien extends SinhVien {
    public String toString(){
        return "Cuu Sinh Vien: " +this.name+", "+this.birthday+", "+this.birthplace;
    }
    public CuuSinhVien(String name, String birthday, String birthplace) {
        super(name, birthday, birthplace);
    }
}
