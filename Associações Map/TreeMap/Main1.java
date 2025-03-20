import java.util.TreeMap;
import java.util.Map;

public class Main1{
    public static void main(String[] args) {
        // Criando um TreeMap vazio (ordenação natural/crescente)
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adicionando pares chave-valor
        treeMap.put("Maçã", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Laranja", 8);

        // Exibindo o TreeMap (os elementos são ordenados pelas chaves)
        System.out.println(treeMap);
    }
}
