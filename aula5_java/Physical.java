package aula5_java;

public class Physical extends Game{
    
    private String lot;

    Physical(String tittle, float price, String lot){
        super(tittle, price);
        this.lot = lot;
    }

    public void printGame(){
        System.out.println("Tittle: " + getTitle());
        System.out.println("Price: " + getPrice());
        System.out.println("Lot: " + lot);
    }

}
