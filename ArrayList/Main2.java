import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //[System.in] =  entrada de dados padrão (pelo teclado)
        //objeto [sc] =  instancia da classe [Scanner] para ler entrada do teclado
        
        String antigo, novo;
        int i, indice;
        ArrayList<String> grupoTrabalho = new ArrayList<String>();
        
        // para grupos de cinco componentes
        for (i = 0; i < 5; i++) {
            System.out.print(" Digite o nome do integrante " +(i + 1)+": ");
            grupoTrabalho.add(sc.nextLine());
            //[ sc.nextLine()] = instancia da classe [Scanner] que le uma linha 
            //      inteira digitada peo usuário e adiciona o conteudo na lista
            //      [ grupoTrabalho ]
        }
        
        System.out.println(" Número de elementos do grupo: " + grupoTrabalho.size());
        System.out.println(" --- Substituição de um elemento por outro ----");
        System.out.print(" Digite o nome do componente a ser substituído:");
        antigo = sc.nextLine();
        indice = grupoTrabalho.indexOf(antigo);
        //[ .indexOf(<elemento>) ]=busca a posição (indice) para 1 ocorrencia do elemento
        
        System.out.println(" O componente [" + grupoTrabalho.get(indice) +
            "] será substituído.");
        System.out.print(" Digite o nome do componente novo:");
        novo = sc.nextLine();
        
        grupoTrabalho.set(indice, novo);
        //esta adicionando o valor da variavel [ novo ] a lista [grupoTrabalho] na posição 
        //  valor da variavel [indice]
        
        System.out.println(" -----Retirada de um elemento do grupo------");
        System.out.print(" Digite o nome do componente a ser eliminado:");
        antigo = sc.nextLine();
        indice = grupoTrabalho.indexOf(antigo);
        
        grupoTrabalho.remove(indice);
        //eliminando o elemento que esta na posição [indice]
        
        System.out.println(" Grupo atual - Número de elementos do grupo: " +
            grupoTrabalho.size());
        System.out.println(" Elementos do grupo: ");
        
        Iterator<String> iterator = grupoTrabalho.iterator();
        //- [grupoTrabalho.iterator()] = retorna um objeto do tipo [ Iterator<String> ] 
        // que permite percorrer os elementos da lista [grupoTrabalho]
        //- [Iterator] = é uma interface que fornece métodos para iterar sobre coleções/listas
        
        i = 0;
        while (iterator.hasNext()) {
        //O loop continua enquanto houver elementos na lista [grupoTrabalho], usando
        // [iterator.hasNext()] para retorna [true]
        
            System.out.println(" Posição " + i + " tem o componente: " + iterator.next());
            //[iterator.next()] = retorna o elemento da lista e avança o [Iterator] para o próximo elemento
            i++;
        }
        
        System.out.println(" ---Limpando o ArrayList---");
        grupoTrabalho.clear();
        
        System.out.println(" Número de elementos do grupo:" + grupoTrabalho.size());
        
        sc.close();
        //[sc.close()] = fecha o objeto [Scanner], liberando os recursos associados a ele
    }
}
