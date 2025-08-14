package aula1_java;

import java.util.Scanner;

public class atividade5_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Length: " + name.length());
        System.out.println("First: " + name.charAt(0));
        System.out.println("Last: " + name.charAt(name.length() - 1));
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Uppercase: " + name.toUpperCase());

        sc.close();
    }
}
