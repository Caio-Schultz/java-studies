public class Carro {

    private String modelo;
    private String cor;
    private int preco;

    Carro(String modelo, String cor, int preco){
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    String getModelo(){
        return this.modelo;
    }
    String getCor(){
        return this.cor;
    }
    String getPreco(){
        return "R$" + this.preco;
    }
    void setCor(String cor){
        this.cor = cor;
    }
    void setPreco(int preco){
        if(preco < 0){
            System.out.println("Preço não pode ser menor que 0");
        }
        else{
            this.preco = preco;
        }
    }


}


