public class Operadoreslogicos {
    public static void main(String[] args){

        // && = AND/E -> todas as condições devem ser satisfeitas
        // || = OR/OU -> pelo menos uma condição precisa ser satisfeita
        // ! = NOT/NÃO -> inverte, ou seja, se algo é verdadeiro ele se torna falso e vice-versa

        double temperatura = 35;
        boolean ensolarado = false;

        if(temperatura <= 30 && temperatura > 0 && ensolarado){
            System.out.println("O tempo está bom!");
            System.out.println("Está ensolarado lá fora!");
        }
        else if(temperatura <= 30 && temperatura > 0 && !ensolarado){
            System.out.println("O tempo está bom!");
            System.out.println("Está nublado lá fora!");
        }
        else if((temperatura > 30 || temperatura < 0)  && (ensolarado)){
            System.out.println("O tempo está ruim!");
            System.out.println("Está ensolarado lá fora!");
        }
        else if ((temperatura > 30 || temperatura < 0) && (!ensolarado)){
            System.out.println("O tempo está ruim!");
            System.out.println("Está nublado lá fora!");
        }

    }
}
