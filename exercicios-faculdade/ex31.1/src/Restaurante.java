public class Restaurante extends Empresa{

    private String nomeDoPrato;
    private double precoMedio;

    public Restaurante(){
        super();
        this.nomeDoPrato = "";
        this.precoMedio = 0;
    }
    public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone, String nomeDoPrato, double precoMedio){
        super(nome, endereco, cidade, estado, cep, telefone);
        this.nomeDoPrato = nomeDoPrato;
        this.precoMedio = precoMedio;
    }


    @Override
    public void setNome(String nome){
        nome = "Restaurante " + nome;
        super.setNome(nome);
    }
    @Override
    public String getNome(){
        return super.getNome();
    }
    public String getNomeDoPrato(){
        return this.nomeDoPrato;
    }
    public void setNomeDoPrato(String nomeDoPrato){
        this.nomeDoPrato = nomeDoPrato;
    }
    public double getPrecoMedio(){
        return this.precoMedio;
    }
    public void setPrecoMedio(double precoMedio){
        this.precoMedio = precoMedio;
    }
    @Override
    public void lerDados(){
        super.lerDados();
        System.out.print("Digite o nome do prato principal: ");
        setNomeDoPrato(scanner.nextLine());
        System.out.print("Digite o preço médio dos pratos do seu restaurante: ");
        setPrecoMedio(scanner.nextDouble());
    }
    public String imprimirDados(){
        return super.imprimirDados() + ", prato principal: " +  this.nomeDoPrato + ", preço médio: " + this.precoMedio;
    }
}
