package nivelIntermediario;

public record NinjaRecord(String nome, String email, int telefone) {

    // todos os atributos são final por padrão
    // records não possuem setters
    // Usa-se records como sabemos que o valor de cada atributo nunca vai mudar, uma vez que todos os atributos são 'final'

    public String emailCaixaAlta(){
        return this.email.toUpperCase();
    }
}
