public class Carro {


    String marca = "Honda";    // todas essas variáveis são atributos, são coisas que esse objeto possui. Um carro, por exemplo, possui uma marca, modelo, preço, etc
    String modelo = "Civic";   // a ideia é cada objeto diferente declarado no código principal ter atributos diferentes, mas compartilharem os mesmos métodos (ações). É por isso que existem os métodos construtores
    int ano = 2025;
    double preco = 200000.99;
    boolean estaLigado = false;

    void ligar(){
        estaLigado = true;
        System.out.println("Você liga o motor");
    }          // cada método descreve e cria uma ação que o objeto é capaz de executar
    void desligar(){
        estaLigado = false;
        System.out.println("Você desliga o motor");
    }
    void dirigir(){
        System.out.println("Você dirige o " + modelo);
    }
    void freiar(){
        System.out.println("Você freia o " + modelo);
    }
}
