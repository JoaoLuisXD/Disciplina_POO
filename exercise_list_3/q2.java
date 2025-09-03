package exercise_list_3;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int escolha = 0;
        double saldo = 1000;
        double deposito = 0;
        double saque = 0;

        
        
        do{
            System.out.println("-----MENU-----");
            System.out.println("1 - VER SALDO");
            System.out.println("2 - DEPOSITAR");
            System.out.println("3 - SACAR");
            System.out.println("4 - SAIR");
            System.out.println("-----");
            System.out.print("-> ");
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("SEU SALDO: " + saldo);
                    break;
                case 2:
                    System.out.print("QUANTO DESEJAR DEPOSITAR: ");
                    deposito = sc.nextDouble();
                    saldo += deposito;
                    break;
                case 3:
                    System.out.print("QUANTO DESEJA SACAR: ");
                    saque = sc.nextDouble();
                    if (saque > saldo) System.out.println("\nSALDO INSUFICIENTE");
                    else saldo -= saque;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("NUMERO INVALIDO");
                    break;
            }
        } while (escolha != 4);
            
        System.out.printf("\n-----\nSEU SALDO FINAL: %.2f", saldo);
        sc.close();
    }
}
