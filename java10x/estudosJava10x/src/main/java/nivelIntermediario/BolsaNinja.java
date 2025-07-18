package nivelIntermediario;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    private List<T> ferramentas;

    public BolsaNinja(){
        this.ferramentas = new ArrayList<>();
    }

    //TODO metodo para permitir adicionar ferramentas na lista de ferramentas
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //TODO metodo para mostrar as ferramentas
    public void mostrarFerramentas(){
        for(T ferramenta : ferramentas){
            System.out.println(ferramenta);
        }

    }

}
