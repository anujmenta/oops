import java.io.*;

public class Fibonacci {
    public static void main(String[] args) {
        Integer n;
        java.util.Scanner in;

        in = new java.util.Scanner(System.in);
        System.out.println("Enter a number");
        n = in.nextInt();

        Integer a = 0;
        Integer b = 1;
        Integer c = 1;
        for(Integer i = 0; i< n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("The " + n + " th Fibonnaci number is: " + a);

        System.exit(0);
    }
}
