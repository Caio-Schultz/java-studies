public class Precisaonoprintf {
    public static void main(String[] args){

        /* é possível limitar a quantidade
        de casas decimais em um número com o tipo double
        usando printf, ou seja, ao invés de printar um número como
        19.9999999, você pode limitar a 2 casas decimais: 19.99
         */

        /* ao invés de %[caractere-específico-do-tipo], podemos mudar para
        %[.precisão][caractere-específico-do-tipo]
        Ex:
        double preco1 = 9.99;
        System.out.printf("%.1f", preco1);
        Saída: 9.9
        A saída ficou com uma casa decimal depois do ponto como especificado
        caso você queira 2 casas é preciso fazer:
        System.out.printf("%.2f", preco1);
        e por ai vai
         */

        double preco1 = 9.99;
        double preco2 = 100.15;
        double preco3 = -54.01;

        System.out.printf("%.1f\n", preco1);
        System.out.printf("%.2f\n", preco2);
        System.out.printf("%.3f\n", preco3);
    }
}
