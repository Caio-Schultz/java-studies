package nivelIntermediario;

import java.util.ArrayList;
import java.util.List;

// Usa-se os 'diamantes' para identificar uma generic
// É prática comum usar a letra T maiúscula
// O tipo será definido ao instanciarmos um objeto dessa classe
public class BolsaGenerica<T> {

    /*
    Aqui ao invés de definirmos um tipo para list, colocamos o tipo genérico
    identificado pela letra T
    */
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    // Colocar equipamentos genéricos
    public void adicionarEquipamento(T equipamentoNinja){
        equipamentos.add(equipamentoNinja);
    }

    @Override
    public String toString(){
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }

}
