package hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        /*
            HashMap = Uma estrutura de dados que armazena pares key-value
                      Keys são únicos, mas Values podem ser duplicados
                      Não mantém nenhuma ordem, mas é eficiente em termos de memória
                      HashMap<Key, Value>
         */

        HashMap<String, Double> map = new HashMap<>();

        map.put("Maçã", 0.50);   // método put() coloca valores
        map.put("Abacaxi", 0.75);
        map.put("Banana", 0.25);
        // map.put("Abacaxi", 10000); como o paramêtro Key é único, caso eu coloque o mesmo valor Key (no caso, Abacaxi) o value será substituído, ou seja, ao invés de ser 0.75 será 10000
        map.put("Laranja", 0.60);
        // map.remove("Maçã");  método remove() vai remover do HashMap oq foi colocado entre parênteses

        System.out.println(map.get("Maçã")); // .get() retorna o value da key colocada entre parênteses
        System.out.println(map.containsKey("Banana")); // .containsKey() retorna um boolean para caso o HashMap contém ou não a key entre parênteses
        System.out.println(map.containsValue(0.60));  // .containsValue() retorna um boolean para caso o HashMap contém ou não o value entre parênteses
        System.out.println(map.size());  // .size() retorna o tamanho do HashMap


        for(String key : map.keySet()){  // keySet() retorna todas as keys do HashMap
            System.out.println(key + ": $ " + map.get(key));
        }
    }
}
