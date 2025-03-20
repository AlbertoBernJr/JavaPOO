import java.util.TreeMap;
import java.util.Comparator;

public class Main2{
    public static void main(String[] args) {
        // Criando um TreeMap com ordenação decrescente - usando [comparator]
        TreeMap<String, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());

        treeMap.put("Maçã", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Laranja", 8);

        System.out.println(treeMap);
    }
}
