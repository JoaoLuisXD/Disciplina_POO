package exercise_list_2;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vector[] = new int[10];
        for(int i = 0; i < vector.length; i++)
        {
            System.out.print("-> ");
            vector[i] = sc.nextInt();
        }
        for(int i = 0; i < vector.length; i++)
        {
            System.out.printf("Position |%d|, Number |%d|\n",i,vector[i]);
        }


        sc.close();
    }
}
