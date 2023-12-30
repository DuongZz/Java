package Buoi5.B1;

public class Tape extends Publication {
    private String playingTime;

    public String toString(){
        return "Tape details: " +this.name+", "+this.price+", "+this.playingTime;

    }

    public Tape(String name, String price, String playingTime) {
        super(name, price);
        this.playingTime = playingTime;
    }

    @Override
    public void getData() {
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Price: ");
        price = input.nextLine();
        System.out.print("Playing Time: ");
        playingTime = input.nextLine();
    }

    @Override
    public void putData() {
        System.out.println("***************");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Playing Time: " + playingTime);
        System.out.println("***************");
    }

}
