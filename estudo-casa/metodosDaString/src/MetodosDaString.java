public class MetodosDaString {
    public static void main(String[] args){


        String nome = "Caio Mazziero Schultz";

        int comprimento = nome.length();
        char letra = nome.charAt(0);
        int index = nome.indexOf("o");
        int lastIndex = nome.lastIndexOf("o");

        // nome = nome.toUpperCase();
        // nome = nome.toLowerCase();
        // nome = nome.trim();
        // nome = nome.replace();
        // nome.isEmpty() retorna um valor booleano
        // nome.contains("");
        // nome.equals("     ");
        // nome.equalsIgnoreCase("      ");

        System.out.println(comprimento);
        System.out.println(letra);
        System.out.println(index);
        System.out.println(lastIndex);
    }
}
