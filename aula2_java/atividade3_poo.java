package aula2_java;

import java.util.Scanner;

public class atividade3_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int soma_par = 0;
        while (n % 2 == 0) 
        {
            System.out.println("par");
            soma_par = soma_par + n;
            System.out.print("digite outro numero: ");
            n = sc.nextInt();
        }
        System.out.println("Soma: " + soma_par);

        sc.close();
    }
}
