package aula4_java;

public class atividade3_poo {
    public static void main(String[] args) {

        House casa3 = new House(1,2,"center");
        House casa4 = new House();
        House casa5 = new House("interior");

        casa3.printHouse();
        casa4.printHouse();
        casa5.printHouse();
        casa3.addDoors();
        casa3.printHouse();
    } 
}
