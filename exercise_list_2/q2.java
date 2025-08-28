package exercise_list_2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vet1[] = new int[3];
        int vet2[] = new int[3];
        int vet3[] = new int[6];

        for(int i = 0; i < vet1.length; i++)
        {
            System.out.print("-> ");
            vet1[i] = sc.nextInt();
            vet3[i] = vet1[i];
        }

        for(int i = 0; i < vet2.length; i++)
        {
            System.out.print("-> ");
            vet2[i] = sc.nextInt();
            vet3[i+3] = vet2[i];
        }

        for(int i = 0; i < vet3.length; i++)
        {
            System.out.printf("|%d| ",vet3[i]);
        }

        sc.close();
    }
}
