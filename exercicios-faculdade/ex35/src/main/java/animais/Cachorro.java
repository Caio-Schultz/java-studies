package animais;

public class Cachorro implements Animal{

    @Override
    public void produzirSom(){
        System.out.println("O cachorro late!");
    }
    @Override
    public void movimento(){
        System.out.println("O cachorro anda!");
    }
}
