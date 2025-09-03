package exercise_list_3;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas[][] = new double[3][2];
        double media[] = new double[3];
        double mediaGeral = 0;

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.printf("nota do aluno %d: ",i+1);
                notas[i][j] = sc.nextDouble();
                System.out.println();
                media[i] += notas[i][j] / 2;
                
            }
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.printf("Nota do aluno %d: %.2f\n",i+1,notas[i][j]);
            }
            System.out.printf("Media do aluno %d: %.2f\n",i+1,media[i]);
            if (media[i] >= 7 ) System.out.println("Aprovado\n");
            else System.out.println("Reprovado\n");
        }
        for(int i = 0; i < media.length; i++)
        {
            mediaGeral += media[i];
        }
        System.out.printf("\nMEDIA GERAL DA TURMA: %.2f",mediaGeral/3);



        
        

        sc.close();
    }
}
