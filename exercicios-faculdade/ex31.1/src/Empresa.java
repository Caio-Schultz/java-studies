import java.util.Scanner;

public class Empresa {

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    Scanner scanner = new Scanner(System.in);


    public Empresa(){
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.telefone = "";
    }
    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public String getCidade(){
        return this.cidade;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public String getCep(){
        return this.cep;
    }
    public void setCep(String cep){
        this.cep = cep;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void lerDados(){
        System.out.print("Digite o nome da sua empresa: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o endereço da sua empresa: ");
        setEndereco(scanner.nextLine());
        System.out.print("Digite a cidade que sua empresa está localizada: ");
        setCidade(scanner.nextLine());
        System.out.print("Digite o estado que sua empresa está localizada: ");
        setEstado(scanner.nextLine());
        System.out.print("Digite o CEP da sua empresa: ");
        setCep(scanner.nextLine());

        System.out.print("Digite o telefone da sua empresa: ");
        setTelefone(scanner.nextLine());
    }
    public String imprimirDados(){
        return "Dados: nome: " + this.nome + ", endereço: " + this.endereco + ", cidade: " + this.cidade + ", estado: " + this.estado + ", CEP: " + this.cep + ", telefone: " + this.telefone;
    }
}
