package aula4_java;

public class atividade3_poo {
    public static void main(String[] args) {

        house casa1 = new house();
        casa1.numDoors = 1;
        casa1.numWindows = 2;
        casa1.adress = "Center";

        house casa2 = new house();
        casa2.numDoors = 3;
        casa2.numWindows = 4;
        casa2.adress = "Interior";

        System.out.println(casa1.adress);
        System.out.println(casa2.adress);
    }    
}
