public class FuncoesOveloaded {
    public static void main(String[] args){

        // Funções overloaded = possuem o mesmo nome, mas diferentes parâmetros
        // assinatura = nome + parâmetros
        // cada função terá uma "Assinatura" (signature) própria de acordo com o conjunto de nome mais seus parâmetros


        System.out.println(adicao(1, 5, 7, 7));

    }
    static double adicao(double num1, double num2){
        return num1 + num2;
    }
    static double adicao(double num1, double num2, double num3){
        return num1 + num2 + num3;
    } // essa função possui o mesmo nome da outra, mas com parâmetros difentes. Isso é válido em java
    static double adicao(double num1, double num2, double num3, double num4){
        return num1 + num2 + num3 + num4;
    }

}
