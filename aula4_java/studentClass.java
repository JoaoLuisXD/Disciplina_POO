package aula4_java;

public class studentClass {
    String name;
    int age;
    String registration;
    String CPF;

    studentClass(String name, int age, String registration, String CPF)
    {
        this.name = name;
        this.age = age;
        this.registration = registration;
        this.CPF = CPF;
    }

    public void printStudent()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Registrantion: " + registration);
        System.out.println("CPF: " + CPF);
    }
}
