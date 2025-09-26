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

        Rent rent1 = new Rent(5,7,"itaicity",6);
        System.out.println(rent1.getNumWindows());
        rent1.setRentValue(1);
        rent1.setNumDoors(5);

        House casa6 = new Rent(1,2, "fortalcity", 500);

        Sale sale1 = new Sale(1, 2, "ifce", 500000);
        System.out.println(sale1.getSaleValue());

        House casa7 = new Sale(8, 9, "mossoro", 300000);

        rent1.printHouse();

    } 
}
