import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Como será criada uma quantidade qualquer de alunos,
        // usaremos apenas um objeto que será instanciado várias vezes,
        // sendo quantas forem necessárias, pois é auxiliar e
        // poderá ser reaproveitado.
        Aluno a;
        
        // Variável para determinar a escolha do usuário
        int escolha = 1;
        
        // Contador
        int cont = 0;
        
        // Variável (flag) para determinar o término da entrada de dados
        boolean continua = true;
        
        // Criação do ArrayList com (cast) para objetos Aluno
        ArrayList<Aluno> array = new ArrayList<>();
        
        // Repetição para entrada de dados
        // O objeto "a", que é do tipo Aluno, será reutilizado para
        // realizar as entradas de dados.
        do {
            // Instanciação de um objeto temporário para a entrada de dados
            a = new Aluno();
            
            // Realiza a entrada de dados do objeto.
            a.entradaDados();
            
            // Adiciona o objeto ao ArrayList após a inclusão
            // O objeto auxiliar pode ser reaproveitado.
            array.add(a);
            
            // Determina a escolha do usuário.
            System.out.print("Deseja incluir mais [1-Sim, 2-Nao]? ");
            escolha = Integer.parseInt(sc.nextLine());
            System.out.println("-----------------------");
            
            if (escolha != 1) {
                continua = false;
            }
        } while (continua);
        
        // Exibe a quantidade de elementos incluídos no ArrayList.
        System.out.println("Número de elementos no ArrayList: " + array.size());
        
        // Cria um objeto Iterator para a interação de objetos Aluno.
        Iterator<Aluno> it = array.iterator();
        
        // Repete enquanto houver elementos.
        while (it.hasNext()) {
            // Reutiliza o objeto auxiliar para recuperar os dados do objeto.
            a = it.next();
            
            // Exibe os dados do objeto recuperado.
            a.imprimir();
            
            // Conta a quantidade de objetos recuperados.
            cont++;
            
            System.out.println("-----------------------");
        }
        
        // Exibe a quantidade de elementos recuperados.
        System.out.println("Número de elementos no Iterator: " + cont);
        
        // Exibe a quantidade de elementos do ArrayList.
        System.out.println("Número de elementos no ArrayList: " + array.size());
    }
}
