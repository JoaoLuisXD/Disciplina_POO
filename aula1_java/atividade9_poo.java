package aula1_java;

import java.util.Locale;
import java.util.Scanner;

public class atividade9_poo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total amount of your purchase: ");
        float value = sc.nextFloat();

        System.out.print("Enter your code: ");
        int code = sc.nextInt();

        float new_value;
        switch (code) {
            case 1:
                System.out.println("Total amount: " + value);
                break;
            case 2:
                new_value = value - (value * 0.05f);
                System.out.println("Total amount: " + new_value);
                break;
            case 3:
                new_value = value - (value * 0.1f);
                System.out.println("Total amount: " + new_value);
            default:
                System.out.println("Invalid code!!!");
                break;
        }


        sc.close();
    }    
}
