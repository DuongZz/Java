package Buoi5.B2;

public class SinhVienNganhDien extends SinhVien {
    public String toString(){
        return "Sinh Vien Nganh Dien: " +this.name+", "+this.birthday+", "+this.birthplace;
    }
    
    public SinhVienNganhDien(String name, String birthday, String birthplace){
        super(name, birthday, birthplace);
    }
}
