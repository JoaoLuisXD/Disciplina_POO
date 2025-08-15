package aula1_java;

import java.util.Locale;
import java.util.Scanner;

public class atividade7_poo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        float height;
        int age;

        System.out.print("height: ");
        height = sc.nextFloat();
        System.out.print("age: ");
        age = sc.nextInt();

        if((age > 18) && (height > 1.6f))
        System.out.println("Approved");
        else
        System.out.println("Failed");

        System.out.println("----------------------");

        int idade = 10;
        String a = idade >= 18 ? "Maior" : "Menor";

        System.out.println(a);



        sc.close();
    }
}
