public class ex022 {
    public static void main(String[] args){
        int i = 1;
        double soma = 0;
        double media;

        while(i <= 1000){
            soma = soma + i;
            i++;
        }
        media = soma/1000;

        System.out.printf("A média dos números de 1 a 1000 é %.2f", media);

    }
}
