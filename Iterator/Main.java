import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carlos");

        // --- PRIMEIRO LOOP: APENAS IMPRIME ---
        Iterator<String> iteratorImprimir = nomes.iterator(); // Cria um iterator novo
        while (iteratorImprimir.hasNext()) {
            String nome = iteratorImprimir.next();
            System.out.println(nome); // Imprime cada elemento
        }

        // --- SEGUNDO LOOP: REMOVE "Bob" ---
        Iterator<String> iteratorRemover = nomes.iterator(); // Cria OUTRO iterator novo
        while (iteratorRemover.hasNext()) {
            String nome = iteratorRemover.next();
            if (nome.equals("Bob")) {
                iteratorRemover.remove(); // Remove "Bob" com segurança
            }
        }

        System.out.println("Lista após remoção: " + nomes); // Saída: [Alice, Carlos]
    }
}
