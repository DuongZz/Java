package Buoi4.B2;

import java.util.Scanner;

abstract class Publication {
    protected String name;
    protected String price;
    Scanner input = new Scanner(System.in);

    public Publication(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public abstract void getData();
    public abstract void putData();

    public static void main(String[] args) {
        Book book = new Book("","","");
        book.getData();
        book.putData();
        Tape tape = new Tape("","","");
        tape.getData();
        tape.putData();
    }
}
