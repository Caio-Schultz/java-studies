public class Nestedloop {
    public static void main(String[] args){

        // nested loop = um loop dentro de outro loop
        // geralmente usado em matrizes ou estruturas de dados


        for(int i = 1; i <= 3; i++){     // não é possível usar o mesmo index quando se coloca um loop dentro de outro, por isso o primeiro for declara 'i' e o segundo 'j'
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }



    }
}
