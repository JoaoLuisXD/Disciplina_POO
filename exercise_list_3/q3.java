package exercise_list_3;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 42;
        int numeroUsuario = 0;
        System.out.println("TENTE ADVINHAR O NUMERO SECRETO");
        System.out.println("-----");
        do {
            System.out.print("Digite um numero: ");
            numeroUsuario = sc.nextInt();
            if(numeroUsuario > numeroSecreto) System.out.println("Seu palpite foi maior que o numero secreto!");
            if(numeroUsuario < numeroSecreto) System.out.println("Seu palpite foi menor que o numero secreto!");
        } while (numeroUsuario != numeroSecreto);
        System.out.println("Parabens!!!!");
        System.out.println("Voce acertou o numero secreto!!!");
        sc.close();
    }
}
