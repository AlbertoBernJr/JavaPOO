public class Utilitarios {
    // Método genérico que troca dois elementos em um array
    public static <T> void trocar(T[] array, int i, int j) {
    //[<T> antes do void]=Esse método trabalhará com um tipo genérico que chamaremos de [T]
    //    - Pode ser String, Integer, Double, ou qualquer outro tipo.
    //[T[] array]= Um array de qualquer tipo (String[], Integer[], etc.).
    //[int i] e [int j]= Posições dos elementos que serão trocados.
    
        T temp = array[i];
        //guarda o valor de [array[i]] em [temp] (variável temporária do tipo T)
        
        array[i] = array[j];
        //Coloca o valor de [array[j]] na posição [i]
        
        array[j] = temp;
        //Coloca o valor de [temp] (antigo array[i]) na posição [j]
    }
    //O método [trocar()] é genérico porque funciona com qualquer tipo (<T>)
    //Ele troca dois elementos em um array, independentemente do tipo.
}
