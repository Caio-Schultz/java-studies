package model;

public class Pessoa {

    private Integer id;
    private String nome;
    private String email;

    public Pessoa(){

    }

    public Pessoa(Integer id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public int getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "model.Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
