package nivelIntermediario;

public abstract class Ninja implements Estrategia{

    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Genin, Chuunin, Jounin, Hokage

    private String nome;
    private int idade;
    private String aldeia;
    private int numeroDeMissoesConcluidas;
    private NivelNinja rank;



    public Ninja() {
    }

    // Os construtores são imutáveis, ou seja, uma vez criados eles não devem ter novos parâmetros
    // Dessa forma, caso você crie novos atributos na classe, você deve fazer a sobrecarga de construtores
    // criando um construtor novo com todos os parâmetros
    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //TODO: Sobrecarga do construtor
    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        // Na sobrecarga, eu não preciso inicializar novamente os parâmetros que já foram inicializados em outro construtor
        // Basta usar a mesma lógica do 'super' que é a lógica abaixo
        // Usando essa lógica, o 'this' está referenciando o construtor acima
        this(nome, idade, aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
    }

    // Criar um metodo público personalizado

    public String euSouUmNinja(){
        return "Eu sou o ninja " + this.nome + "!";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        if(this.idade < idadeMinimaParaSerHokage){
            return idadeMinimaParaSerHokage - this.idade;
        }
        else {
            return 0;
        }
    }

    // Métodos gerais! Todos os ninjas vão ter
    public abstract void habilidadeEspecial();

    // Sobreescrendo metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja(){
        System.out.println("Essa é minha estratégia de combate!");
    }


    // Sobrecarga de metodo - Inteligência de combate
    @Override
    public void inteligenciaDeCombate(){
        System.out.println("Meu nome é " + this.nome + " e essa é minha inteligência de combate!");
    }

    @Override
    public void inteligenciaDeCombate(int qi){
        if(qi > 150){
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        }
        else if(qi >= 130){
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor");
        }
        else{
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
        }
    }

    // todos os ninjas vão fazer esse metodo obrigatoriamente
    // a palavra 'final' faz com que o metodo não seja capaz de ser sobreescrito
    final void tacarKunai(){
        System.out.println("EU SOU UM MÉTODO DA CLASSE MÃE");
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome + ". Eu sou da aldeia " + this.aldeia + " e tenho " + this.idade + " anos de idade";
    }
}
