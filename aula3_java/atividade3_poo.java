package aula3_java;

import java.util.Scanner;

public class atividade3_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[2][3];
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("-> ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.printf("|%d|",matriz[i][j]);
            }
        }


        sc.close();
    }
}
