package exercise_list_3;

public class revisao {
    public static void main(String[] args) {
        String a = "ISABELA";
        String b = "joao luis";

        if (a.equals(b)) 
        {
            System.out.println("Iguais");    
        }
        else System.out.println("Diferentes");
        System.out.println("tamanho a: " + a.length());
        System.out.println("tamanho b: " + b.length());

        System.out.println(a.charAt(3));
        System.out.println(b.charAt(6));

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

    }
}
