import java.util.Scanner;

public class FiguraGeometrica {

    Scanner scanner = new Scanner(System.in);

    public String cor;

    public FiguraGeometrica(){
        this.cor = "";
    }
    public FiguraGeometrica(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void leitura(){
        System.out.print("Digite a cor: ");
        setCor(scanner.nextLine());
    }
    public void imprimir(){
        System.out.println("A cor é: " + getCor());
    }
    public String paraString(){
        return "Cor: " + getCor();
    }
}
