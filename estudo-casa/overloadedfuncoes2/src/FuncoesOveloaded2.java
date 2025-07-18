public class FuncoesOveloaded2 {
    public static void main(String[] args){

        String pizza = pizza("fina", "gorgonzola", "calabresa");

        System.out.println(pizza);

    }
    static String pizza(String massa){
        return "Pizza com massa " + massa;
    }
    static String pizza(String massa, String queijo){
        return "Pizza com massa " + massa + ", com " + queijo;
    }
    static String pizza(String massa, String queijo, String topping){
        return "Pizza com massa " + massa + " de " + queijo + " e  " + topping;
    }

}
