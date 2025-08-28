package aula3_java;

import java.util.Scanner;

public class atividade1_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vetor[] = new int[4];
        vetor[0] = 1;

        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("Enter a value for the vector: ");
            vetor[i] = sc.nextInt();
        }
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println("-> " + vetor[i]);
        }
        

        sc.close();
    }
}
