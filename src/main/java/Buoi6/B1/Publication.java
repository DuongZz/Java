package Buoi6.B1;

import java.util.Scanner;

public abstract class Publication {
    protected String name;
    protected String price;
    Scanner input = new Scanner(System.in);

    public Publication(String name, String price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    public String getPrice(){
        return price;
    }
    public abstract void getData();
    public abstract void putData();

}
