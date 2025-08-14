package aula1_java;
import java.util.Scanner;

public class atividade2_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value in Celsius: ");
        float Celsius = sc.nextFloat();
        float Fahrenheit = 1.8f*Celsius + 32; // f at the end to specify that it is a float.

        System.out.println("Fahrenheit: " + Fahrenheit);
        
        sc.close();
    }
}
