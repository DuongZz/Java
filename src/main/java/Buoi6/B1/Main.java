package Buoi6.B1;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        ArrayList<Tape> tapeList = new ArrayList<>();
        
        HomePage homePage = new HomePage(bookList, tapeList);
        homePage.setVisible(true);
        homePage.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
}
