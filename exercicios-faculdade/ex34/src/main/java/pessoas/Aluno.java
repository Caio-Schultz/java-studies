package pessoas;

public class Aluno extends Pessoa{

    private String curso;
    static final String cursoDefault = "Sistema da Informação";

    public Aluno(){
        super();
        this.curso = "";
    }
    public Aluno(String name, int age, String curso){
        super(name, age);
        this.curso = curso;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    public void lerDados(String name, int age, String curso){
        this.name = name;
        this.age = age;
        this.curso = curso;
    }
    @Override
    public String getNomeFormatado(){
        return this.name.toUpperCase();
    }
    @Override
    public String imprimirDados(){
        return super.imprimirDados() + ", curso: " + this.curso;
    }
}
