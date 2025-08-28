package exercise_list_2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int vector[] = new int[20];
        
        for(int i = 0; i < vector.length; i++)
        {
            System.out.print("-> ");
            vector[i] = sc.nextInt();
            if (vector[i] < 0)
            {
                System.out.println("try another value");
                vector[i] = sc.nextInt();
            }
            if (vector[i] > max) 
                max = vector[i];
        } 
        
        for(int i = 0; i < vector.length; i++)
        {
            System.out.printf("|%d| ",vector[i]);
        }
        System.out.println("MAX: " + max);
        sc.close();
    }
}
