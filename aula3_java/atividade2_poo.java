package aula3_java;

import java.util.Scanner;

public class atividade2_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[3];
        int vet2[] = new int[3];
        int vet3[] = new int[6];
        for(int i = 0; i < vet1.length; i++)
        {
            System.out.print("Enter 3 values, for the first vector: ");
            vet1[i] = sc.nextInt();
            vet3[i] = vet1[i];
        }
        for(int i = 0; i < vet2.length; i++)
        {
            System.out.print("Enter 3 values, for the second vector: ");
            vet2[i] = sc.nextInt();
            vet3[i+3] = vet2[i];
        }
        for(int i = 0; i < vet3.length; i++)
        {
            System.out.println(vet3[i]);
        }
        


        sc.close();
    }
}
