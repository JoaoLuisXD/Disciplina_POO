package aula5_java;

public class atividade1_poo {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.makeSound();

        Animal animal2 = new Cat();
        animal2.makeSound();

        if (animal1 instanceof Dog) 
        {
            System.out.println("Dog");
        }
        else System.out.println("Cat");
    }
}
