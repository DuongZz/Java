package Buoi1.B2;

public class Pentagon {
    public static void main(String[] args) {
        int a,b;
        for(a=1; a < 500; a++) {
            for(b=a;b<=Math.sqrt(500*500 - a*a); b++){
                double temp = Math.sqrt(a*a + b*b);
                if(temp == Math.round(temp) && temp < 500){
                    System.out.printf("( %d, %d, %d)\n", a, b, (int)temp);
                }
            }
        }
    }
}
