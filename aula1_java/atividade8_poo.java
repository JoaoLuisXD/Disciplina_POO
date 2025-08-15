package aula1_java;

import java.util.Scanner;

public class atividade8_poo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of your love: ");
        String love = sc.nextLine();

        switch (love) {
            case "Isabela":
                System.out.println("ITS TRUEEEEEEEEEEEEEEE");
                break;
            default:
                System.out.println("ITS LIEEEEEEEEEEEEEEEE");
                break;
        }



        sc.close();
    }
}
