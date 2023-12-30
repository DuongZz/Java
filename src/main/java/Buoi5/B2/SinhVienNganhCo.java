package Buoi5.B2;

public class SinhVienNganhCo extends SinhVien{
    public String toString(){
        return "Sinh Vien Nganh Co: " +this.name+", "+this.birthday+", "+this.birthplace;
    }
    
    public SinhVienNganhCo(String name, String birthday, String birhtplace) {
        super(name, birthday, birhtplace);
    }
}
