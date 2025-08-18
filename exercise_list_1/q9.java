package exercise_list_1;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int []n = new int[3];
        
        for(int i = 0; i < n.length; i++)
        {
            n[i] = sc.nextInt();
        }

        for(int i = 0; i < n.length; i++)
        {
            for(int j = i + 1; j < n.length; j++)
            {
                if (n[i] < n[j]) 
                {
                    int aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;    
                }
            }
        }
        for(int i = 0; i < n.length; i++)
        {
            System.out.println(n[i]);
        }


        sc.close();
    }    
}
