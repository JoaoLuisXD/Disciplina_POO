package aula1_java;

import java.util.Scanner;

public class atividade4_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = "Maria";
        String b = "maria";

        if (a.equals(b)) 
        {
            System.out.println("equals");    
        }
        else System.out.println("different");


        System.out.println(a.length()); //length of String A.
        System.out.println(b.length()); //length of String B.

        System.out.println(a.charAt(0)); // first letter of the String A.
        System.out.println(b.charAt(b.length() - 1)); // last letter of the String B.

        System.out.println(a.toLowerCase()); // all letters of string A in lowercase.
        System.out.println(b.toUpperCase()); // all letters of string B in uppercase.
        sc.close();
    }
}
