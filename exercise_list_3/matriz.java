package exercise_list_3;

import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double mat1[][] = new double[2][2];
        double mat2[][] = new double[2][2];
        double media[] = new double[2];

        for (int i = 0; i < mat1.length; i++) 
        {
            for (int j = 0; j < mat2.length; j++) 
            {
                mat1[i][j] = sc.nextDouble();
                media[i] += mat1[i][j];
            }    
        }
        for (int i = 0; i < media.length; i++) 
        {
            System.out.printf("media %d: %.2f\n",i,media[i]/2);    
        }
        
        sc.close();
    }
}
