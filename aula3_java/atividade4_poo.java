package aula3_java;

import java.util.Scanner;

public class atividade4_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if (matriz[i] == matriz[j])
                    System.out.printf("-> |%d|\n", matriz[i][j]);
            }
        }



        sc.close();
    }
}
