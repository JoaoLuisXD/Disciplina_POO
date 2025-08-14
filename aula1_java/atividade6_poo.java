package aula1_java;

import java.util.Scanner;

public class atividade6_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        if(a % 2 == 0) 
        System.out.println("Pair");
        else 
        System.out.println("Odd");
        sc.close();
    }
}
