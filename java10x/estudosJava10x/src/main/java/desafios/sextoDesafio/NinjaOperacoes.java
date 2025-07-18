package desafios.sextoDesafio;

import java.util.LinkedList;

public class NinjaOperacoes {

    private LinkedList<Ninja> listaDeNinjas;

    public NinjaOperacoes() {
        this.listaDeNinjas = new LinkedList<>();
    }


    public LinkedList<Ninja> getListaDeNinjas() {
        return listaDeNinjas;
    }

    public void setListaDeNinjas(LinkedList<Ninja> listaDeNinjas) {
        this.listaDeNinjas = listaDeNinjas;
    }


    public void removerPrimeiroNinja(){
        this.listaDeNinjas.remove(0);
    }

    public LinkedList<Ninja> adicionarNinjaNoInicio(Ninja ninja){
        this.listaDeNinjas.add(0, ninja);
        return this.listaDeNinjas;
    }

    public Ninja acessarNinja(int index){
        return this.listaDeNinjas.get(index);
    }

    @Override
    public String toString(){
        if(listaDeNinjas.isEmpty()){
            return "Nenhum ninja encontrado!";
        }

        StringBuilder listaCompleta = new StringBuilder();
        for (Ninja ninja : listaDeNinjas) {
            listaCompleta.append(ninja.toString()).append("\n");
        }
        return listaCompleta.toString();
    }



}
