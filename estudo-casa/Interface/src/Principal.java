public class Principal {
    public static void main(String[] args){

        /*  Interface = É um projeto para uma classe que especifica um conjunto de métodos abstratos
                        que classes de implementação devem definir.
                        Suporta vários comportamentos de herança.
                        É útil se uma classe precisar implementar mais de uma classe Pai
                        Nesse exemplo, o peixe implementa tanto a interface Presa quanto a interface Predador
         */


        Coelho coelho = new Coelho();
        Aguia aguia = new Aguia();
        Peixe peixe = new Peixe();

        coelho.fugir();
        aguia.cacar();
        peixe.fugir();
        peixe.cacar();


    }
}
