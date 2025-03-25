public class Generico {
    public <T> void imprimeElementos(T vetor[]) {
        System.out.println("Imprime Vetor:");
        
        for (int i = 0; i < vetor.length; i++) {
        //[vetor.lenght]=obter o tamanho de um vetor/array
        
            System.out.println("Elemento [" + (i + 1) + "]: " + vetor[i]);
        }
    }
}
