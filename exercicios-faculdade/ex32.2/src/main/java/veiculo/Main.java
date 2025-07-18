package veiculo;

public class Main {
    public static void main(String[] args){


        Caminhao caminhao = new Caminhao();

        caminhao.solicitarDados(5000, 150, 300000, 2, 15, 20);

        System.out.println(caminhao.imprimirDados());


    }
}
