package aula2_java;

import java.util.Scanner;

public class atividade5_poo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String verifyLogin = "Joaozin";
        String verifyPassword = "CR7";
        String login;
        String password;
        do {
            System.out.println("Enter your login");
            System.out.print("-> ");
            login = sc.next();
            System.out.println("Enter your password");
            System.out.print("-> ");
            password = sc.next();
            if(login.equals(verifyLogin) && password.equals(verifyPassword))
            {
                System.out.println("|Seja Bem-Vindo|");
            }
            else System.out.println("Try again");

        } while (!verifyLogin.equals(login) || !verifyPassword.equals(password));
        



        sc.close();
    }
}
