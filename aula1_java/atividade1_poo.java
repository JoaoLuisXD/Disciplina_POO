package aula1_java;
import java.util.Locale;
import java.util.Scanner;

public class atividade1_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Enter a value for inches: ");
        float inch = sc.nextFloat();
        float centimeters = inch * 2.54f; // f at the end to specify that it is a float.
        System.out.println("Centimeters = " + centimeters);

        sc.close();
    }
}
