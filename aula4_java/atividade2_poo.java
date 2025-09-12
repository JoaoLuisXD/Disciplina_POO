package aula4_java;

import java.util.Scanner;

public class atividade2_poo {
    public static void main(String[] args) {
        parouimpar();
        epar(3);
    }

    public static void parouimpar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n % 2 == 0) System.out.println("PAR");
        else System.out.println("IMPAR");

        sc.close();
    }
    public static void epar(int n)
    {
        if (n % 2 == 0) System.out.println("par");
        else System.out.println("impar");
    }
}
