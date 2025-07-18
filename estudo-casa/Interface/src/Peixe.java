public class Peixe implements Presa, Predador{

    @Override
    public void fugir(){
        System.out.println("O peixe está nadando para longe!");
    }
    @Override
    public void cacar(){
        System.out.println("O peixe está nadando em busca de presas!");
    }
}
