package Buoi6.B2;


import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<CuuSinhVien> csvList = new ArrayList<>();
        ArrayList<SinhVienNganhCo> svncList = new ArrayList<>();
        ArrayList<SinhVienNganhDien> svndList = new ArrayList<>();
        
        StuManagement stdm = new StuManagement(csvList, svncList, svndList);
        stdm.setVisible(true);
        stdm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}