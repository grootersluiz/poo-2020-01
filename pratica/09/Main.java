package pkg09;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
      Pessoa zeze = new Pessoa("Zezé di Camargo");
        Pessoa luciano = new Pessoa("Luciano");

        CD zezeLuciano = new CD("Roça", new Date(), zeze);
        zezeLuciano.adicionaCantor(luciano);

        System.out.println(zezeLuciano);
    }
    
}