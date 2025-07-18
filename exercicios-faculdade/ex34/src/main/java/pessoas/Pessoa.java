package pessoas;

public abstract class Pessoa {

    String name;
    int age;

    public Pessoa(){
        this.name = "";
        this.age = 0;
    }
    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void lerDados(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String imprimirDados(){
        return "Dados: nome: " + this.name + ", idade: " + this.age;
    }
    public abstract String getNomeFormatado();
}
