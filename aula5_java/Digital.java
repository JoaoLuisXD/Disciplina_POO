package aula5_java;

public class Digital extends Game{
    private String code;

    Digital(String tittle, float price, String code){
        super(tittle, price);
        this.code = code;
    }

    public void printGame(){
        System.out.println("Tittle: " + getTitle());
        System.out.println("Price: " + getPrice());
        System.out.println("Code: " + code);
    }
}
