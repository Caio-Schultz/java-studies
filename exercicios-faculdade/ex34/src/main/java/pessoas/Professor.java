package pessoas;

public class Professor extends Pessoa{

    double salary;
    String title;
    static final String defaultTitle = "Doutor";

    public Professor(){
        super();
        this.salary = 0;
        this.title = "";
    }
    public Professor(String name, int age, double salary, String title){
        super(name, age);
        this.salary = salary;
        this.title = title;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void lerDados(String name, int age, double salary, String title){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.title = title;
    }
    @Override
    public String getNomeFormatado(){
        return this.title + " " + this.name;
    }
    @Override
    public String imprimirDados(){
        return super.imprimirDados() + ", salário: R$" + this.salary + ", título: " + this.title;
    }
}
