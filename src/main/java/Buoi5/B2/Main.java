
package Buoi5.B2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public void writeToFile(ArrayList<CuuSinhVien> csv, ArrayList<SinhVienNganhCo> svnc, ArrayList<SinhVienNganhDien> svnd){
        try {
            FileWriter fw = new FileWriter("src\\main\\java\\Buoi5\\B2\\data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(csv.toString());
            bw.newLine();
            bw.write("-------------");
            bw.newLine();
            bw.write(svnc.toString());
            bw.newLine();
            bw.write("-------------");
            bw.newLine();
            bw.write(svnd.toString());
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<CuuSinhVien> readCSVFromFile(){
        List<CuuSinhVien> csvList = new ArrayList<CuuSinhVien>();
        try{
            FileReader fr = new FileReader ("src\\main\\java\\Buoi5\\B2\\data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) !=null){
                if(line.equals("-------------")){
                    break;
                }
                System.out.println(line);
        }
            br.close();
        } catch (Exception e){
            throw new RuntimeException(e);
        }
        return csvList;
    }
    
    public List<SinhVienNganhCo> readSVNCFromFile(){
        List<SinhVienNganhCo> svncList = new ArrayList<SinhVienNganhCo>();
        boolean readingSVNC = false;
        try {
            FileReader fr = new FileReader("src\\main\\java\\Buoi5\\B2\\data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                if(line.equals("-------------")){
                    readingSVNC = true; 
                    continue;
                }
                if(readingSVNC){
                System.out.println(line);
                }
                if(line.equals("-------------")){
                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return svncList;
    }
    
    public List<SinhVienNganhDien> readSVNDFromFile(){
        List<SinhVienNganhDien> snvdList = new ArrayList<SinhVienNganhDien>();
        boolean readingSVND = false;
//        boolean readingSVNC = false;
        try {
            FileReader fr = new FileReader("src\\main\\java\\Buoi5\\B2\\data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) !=null){
                if(line.equals("-------------")){
                    break; 
                }
                if(readingSVND){
                    System.out.println(line);
                }
                if(line.equals("-------------")){
                    readingSVND = true;
                    continue;
                }
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return snvdList;
    }
    
    public static void main(String[] args) {
        ArrayList<CuuSinhVien> csvList = new ArrayList<CuuSinhVien>();
        ArrayList<SinhVienNganhCo> svncList = new ArrayList<SinhVienNganhCo>();
        ArrayList<SinhVienNganhDien> svndList = new ArrayList<SinhVienNganhDien>();
        CuuSinhVien csv = new CuuSinhVien("", "", "");
        System.out.println(">>>>>Nhập thông tin cựu sinh viên: ");
        csv.setName();
        csv.setBirthday();
        csv.setBirthplace();
        csvList.add(csv);
        SinhVienNganhCo svnc = new SinhVienNganhCo("", "", "");
        System.out.println(">>>>>Nhập thông tin sinh viên ngành cơ: ");
        svnc.setName();
        svnc.setBirthday();
        svnc.setBirthplace();
        svncList.add(svnc);
        SinhVienNganhDien svnd = new SinhVienNganhDien("", "", "");
        System.out.println(">>>>>Nhập thông tin sinh viên ngành điện: ");
        svnd.setName();
        svnd.setBirthday();
        svnd.setBirthplace();
        svndList.add(svnd);
        Main main = new Main();
        main.writeToFile(csvList, svncList, svndList);
        main.readCSVFromFile();
        main.readSVNCFromFile();
        main.readSVNDFromFile(); 
    }
}