import java.util.Arrays; // Adicionado para usar Arrays.toString()

public class Main {
    public static void main(String[] args) {
        String[] nomes = {"Alice", "Bob"};
        Utilitarios.trocar(nomes, 0, 1); //Troca [Alice] (posição 0) e [Bob] (posição 1)
        System.out.println(Arrays.toString(nomes)); // Saída: [Bob, Alice]

        Integer[] numeros = {1, 2, 3};
        Utilitarios.trocar(numeros, 0, 2); //Troca [1] (posição 0) e [3] (posição 2)
        System.out.println(Arrays.toString(numeros)); // Saída: [3, 2, 1]
    }
}
