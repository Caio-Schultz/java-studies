package principal;

import animais.*;

public class Main {
    public static void main(String[] args){

        Cachorro cachorro = new Cachorro();
        Ave ave = new Ave();

        cachorro.produzirSom();
        cachorro.movimento();
        ave.produzirSom();
        ave.movimento();
    }
}
