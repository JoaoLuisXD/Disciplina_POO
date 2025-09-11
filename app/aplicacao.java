package app;

import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        double notas[][] = new double[3][2];
        double media[] = new double[3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j ++)
            {
                System.out.println("Aluno " + i);
                System.out.print("-> ");
                notas[i][j] = sc.nextDouble();
                media[i] += notas[i][j];
            }
            System.out.println("---------");
        }        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("media " + i);
            System.out.println(media[i]/2);
            System.out.println("--------");
        }

        


        sc.close();
    }
}
