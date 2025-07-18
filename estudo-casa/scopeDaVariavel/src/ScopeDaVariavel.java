public class ScopeDaVariavel {

    static int x = 3;
    /* essa variável está no scope CLASS
    ela é declarada na classe.
    ela pode ter o msm nome que uma variável
    nas funções, no entanto a variável da função sempre terá
    prioridade. É interessante declarar variáveis CLASS se
    elas permanecerem com o mesmo valor no resto de todo o
    programa
     */

    public static void main(String[] args){

        // scope da variável = onde a variável pode ser acessada
        // LOCAL e CLASS

        int x = 1;

        /* essa variável é LOCAL dessa função.
         Ela não é reconhecida por outra função,
         por isso é necessário declarar argumentos
         e parâmetros para "transferir" uma variável de
         uma função para outra
         */
        System.out.println(x);

        Exemplo();
    }
    static void Exemplo(){
        int x = 2;
        /* Essa variável tbm é LOCAL, mas
        agora dessa função "Exemplo. Ela
        pode ser declarada com 'x' tbm, pq as variáveis
        de cada função não são reconhecidas pelas outras
        funções
         */
        System.out.println(x);
    }
}
