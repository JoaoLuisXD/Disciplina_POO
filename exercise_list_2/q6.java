package exercise_list_2;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("-> ");
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if (mat[i] == mat[j]) 
                {
                    System.out.printf("|%d|",mat[i][j]);    
                }
            }
        }
        sc.close();
    }
}
