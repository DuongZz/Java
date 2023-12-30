package Buoi5;

public class Book extends Publication {
    private String page;

    public String toString(){
        return "Book details: " +this.name+", "+this.price+", "+this.page;
    }
    @Override
    public void getData() {
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Price: ");
        price = input.nextLine();
        System.out.print("Page: ");
        page = input.nextLine();
    }

    @Override
    public void putData() {
        System.out.println("***************");
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
        System.out.println("Page: "+page);
        System.out.println("***************");
    }
    public Book(String name, String price, String page){
        super(name, price);
        this.page = page;
    }

}
