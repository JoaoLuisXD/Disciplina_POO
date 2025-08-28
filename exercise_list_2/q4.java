package exercise_list_2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mat[][] = new int[2][2];

        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print("-> ");
                mat[i][j] = sc.nextInt();
            }
        }

         for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.printf("|%d|",mat[i][j]);
            }
            System.out.println();
        }


        sc.close();
    }    
}
