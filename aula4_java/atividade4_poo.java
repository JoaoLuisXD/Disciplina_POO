package aula4_java;

public class atividade4_poo {
    public static void main(String[] args) {
        studentClass student1 = new studentClass();
        student1.name = "Joao";
        student1.age = 20;
        student1.registration = "123456";
        student1.CPF = "123.456.789.00";

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.registration);
        System.out.println(student1.CPF);

    }
}
