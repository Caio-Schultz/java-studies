public class Principal {
    public static void main(String[] args){

        /*  Wrapper classes = Permite com que valores primitivos (int, char, double, boolean)
                              sejam usados como objetos. "Wrap them in an objetc"
                              De forma geral, não "envelope" (wrap) valores primitivos, a não ser que você precise de um objeto
                              Permite o uso de "Collections Framework" e "static Utility Methods"
         */


        // AUTOBOXING
        // Instanciar valores primitivos diretamente a um objeto usando wrapper classes

        // Integer a = 123;
        // Double b = 3.14;
        // Character c = '$';
        // Boolean d = true;
        // String e = "Pizza";

        // UNBOXING
        // Retornar valor primitivo que está "envelopado" para seu valor primitivo original
        // int x = a;
        // double y = b;


        String f = Integer.toString(123);  // São úteis para transformar valores primitivos em String
        String g = Double.toString(3.14);
        String h = Character.toString('@');
        String i = Boolean.toString(false);

        String j = f + g + h + i;

        System.out.println(j);


        int a = Integer.parseInt("123");  // São úteis para transformar String em valores primitivos também
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");


        char letra = 'B';

        System.out.println(Character.isLetter(letra));  // Verifica (boolean) se é uma letra. É útil para User Input
        System.out.println(Character.isUpperCase(letra));  // Verifica (boolean) se está maiúsculo.
    }
}
