package generics;

public class Produto<T, U> {  // é possível colocar 2 ou mais type parameter

    T item;
    U price;


    Produto(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }
    public void setItem(T item){
        this.item = item;
    }
    public U getPrice(){
        return this.price;
    }
    public void setPrice(U price){
        this.price = price;
    }


}
