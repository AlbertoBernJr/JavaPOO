import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");

        // Acessando elementos pelo índice
        System.out.println("Primeiro nome: " + nomes.get(0)); // Saída: João

        // Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + nomes.size()); // Saída: 3

        // Iterando sobre a lista
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Removendo um elemento
        nomes.remove("Maria");
      
        System.out.println("Lista após remover Maria: " + nomes); // Saída: [João, Pedro]
    }
}
