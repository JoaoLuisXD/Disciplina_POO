package aula2_java;

import java.util.Scanner;

public class atividade6_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        int choose;
        double result;
        do {
            System.out.println("=== Opcoes ===");
            System.out.println("101- Raiz quadrada");
            System.out.println("102- Metade");
            System.out.println("103- 10% do valor");
            System.out.println("104- Dobro");
            System.out.println("0- Sair");
            System.out.print("Digite sua opcao: ");
            choose = sc.nextInt();

            switch (choose) {
                case 101:
                    System.out.printf("\n|Result: %.2f|\n", Math.sqrt(n));
                    break;
                case 102:
                    result = n / 2;
                    System.out.printf("\n|Result: %.2f|\n",result); 
                    break;
                case 103:
                    result = n * 0.1f;
                    System.out.printf("\n|Result: %.2f|\n",result); 
                    break;
                case 104:
                    result = n * 2;
                    System.out.printf("\n|Result: %.2f|\n",result); 
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\n|Try another option!|\n");
                    break;
            }
        } while (choose != 0);




        sc.close();
    }
}
