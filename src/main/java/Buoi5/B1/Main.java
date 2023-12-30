package Buoi5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public void writeToFile(ArrayList<Book> book, ArrayList<Tape> tape){
        try {
            FileWriter fw = new FileWriter("src\\main\\java\\Buoi5.B1\\data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(book.toString());
            bw.newLine();
            bw.write("-------------");
            bw.newLine();
            bw.write(tape.toString());
            bw.newLine();
            bw.close();
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Book> readBookFromFile(){
        List<Book> bookList = new ArrayList<Book>();
        try {
            FileReader fr = new FileReader("src\\main\\java\\Buoi5\\B1\\data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                if(line.equals("-------------")){
                    break;
                }
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return bookList;
    }
    public List<Tape> readTapeFromFile(){
        List<Tape> tapeList = new ArrayList<Tape>();
        boolean readingTape = false;
        try {
            FileReader fr = new FileReader("src\\main\\java\\Buoi5\\B1\\data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                if(line.equals("-------------")){
                    readingTape = true;
                    continue;
                }
                if(readingTape){
                    System.out.println(line);
                }
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return tapeList;
    }

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();
        ArrayList<Tape> tapeList = new ArrayList<Tape>();
        Book book = new Book("", "", "");
        book.getData();
        book.putData();
        bookList.add(book);
        Tape tape = new Tape("", "", "");
        tape.getData();
        tape.putData();
        tapeList.add(tape);
        Main main = new Main();
        main.writeToFile(bookList,tapeList);
        main.readBookFromFile();
        main.readTapeFromFile();
    }
}
