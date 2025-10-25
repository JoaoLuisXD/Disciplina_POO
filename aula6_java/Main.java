import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       try{
        System.out.println(dividir(10, 5));
       }
       catch(IllegalArgumentException e){
        System.out.println(e.getMessage());
       }
        
    }

    public static int dividir(int a, int b){
        if (b == 0)
            throw new IllegalArgumentException("Divisor é zero!");
        return a/b;
    }
}

