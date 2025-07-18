import java.util.Scanner;

public class Pessoa {

    int idPessoa;
    String nome;
    int idade;
    Scanner scanner = new Scanner(System.in);

    Pessoa(){
        this.idPessoa = 0;
        this.nome = "";
        this.idade = 0;
    }
    Pessoa(int idPessoa, String nome, int idade){
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.idade = idade;
    }
    public int getIdPessoa(){
        return this.idPessoa;
    }
    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public void solicitarDados(){
        System.out.print("Digite seu id: ");
        this.idPessoa = scanner.nextInt();
        System.out.print("Digite seu nome: ");
        this.nome = scanner.nextLine();
        scanner.nextLine();  // limpeza de buffer
        System.out.print("Digite sua idade: ");
        this.idade = scanner.nextInt();
    }
    void fazerAniversario(){
        idade++;
    }
    void mostrarDados(){
        System.out.println(this.idPessoa);
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
