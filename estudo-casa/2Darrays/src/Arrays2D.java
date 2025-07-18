public class Arrays2D {
    public static void main(String[] args){

        /* 2D array (MATRIZ) = Um array que cada elemento é um array
           é útil para armazenar uma matriz de dados
         */

        String mercado[][] = {{"maçã", "banana", "ameixa"},
                            {"batata", "cebola", "cenoura"},
                            {"frango", "picanha", "salmão"}};

        mercado[2][0] = "fraldinha";

        for(String[] comidas : mercado){
            for(String comida : comidas){
                System.out.print(comida + " ");
            }
            System.out.println();
        }

    }
}
