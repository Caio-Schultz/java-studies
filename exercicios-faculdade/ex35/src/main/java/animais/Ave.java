package animais;

public class Ave implements Animal{

    @Override
    public void produzirSom(){
        System.out.println("A ave canta!");
    }
    @Override
    public void movimento(){
        System.out.println("A ave voa!");
    }
}
