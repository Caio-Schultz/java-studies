public class Outrasfunoesprintf {
    public static void main(String[] args){

        /* O printf tem algumas outras funções
        Agora vamos considerar %[flags][width][.precisao][caractere-específico-do-tipo]
         */

        // flags
        /*     + = a saída vai com um sinal de +
        Ex:
        double preco = 9.99;
        System.out.printf("%+.1f", preco;
        Saída: +9.99
        obs: números negativos continuam negativos
       */

        /*   espaço = faz um espaço caso o número seja positivo (é útil para alinhar números positivos e negativos)
             Ex:
             double preco1 = 99.99:
             double preco2 = -54.01;
             System.out.printf("% .2f\n", preco1);
             System.out.printf("% .2f\n", preco2;
             Saída:
              99.99
             -54.01
         */
        // existem outras flags, mas essas são provavelmente as mais úteis

        // width
        /* 0 = alinha números com quantidade de dígitos diferentes com zeros
        ex:
        int id1 = 1;
        int id2 = 23;
        int id3 = 349;
        int id4 = 1923;

        System.out.printf("%04d\n", id1); o 4 identifica que é para alinha com 4 números
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        Saída:
        0001
        0023
        0349
        1923
         */

        /* Se colocarmos um número positivo sem o 0
        vamos alinhar os números na direita
        ex:
        int id1 = 1;
        int id2 = 23;
        int id3 = 349;
        int id4 = 1923;

        System.out.printf("%4d\n", id1); o 4 identifica que é para alinha com 4 números
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        Saída:
           1
          23
         349
        1923
         */
        /* Se colocarmos um número negativo sem o 0
        vamos alinhar os números na esquerda
        ex:
        int id1 = 1;
        int id2 = 23;
        int id3 = 349;
        int id4 = 1923;

        System.out.printf("%-4d\n", id1); o 4 identifica que é para alinha com 4 números
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);

        Saída:
        1
        23
        349
        1923
         */
    }
}
