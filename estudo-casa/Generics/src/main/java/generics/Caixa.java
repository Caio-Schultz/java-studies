package generics;

public class Caixa<T> {

    T item;

    public void setItem(T item){

        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
