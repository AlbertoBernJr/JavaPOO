import java.util.*;
    public class Main2 {
        public static void main(String[] args) {
            HashMap hashMap = new HashMap();
            
            // vetor com os nomes das chaves (key)
            String numeros[]= {"um", "dois", "três", "quatro", "cinco"};
            
            // inserção dos elementos
            for(int i=0; i<5;i++) {
                hashMap.put(numeros[i], i+1);
            }
            
            // alteração de um elemento
            hashMap.put("dois", 2.0);
            
            // recuperação dos elementos
            for(int i=0; i<5;i++) {
                System.out.println("Chave (key): " + numeros[i] + " - Valor= " +
                        hashMap.get(numeros[i]));
            }
            
            // para saber a quantidade de elementos mapeados:
            System.out.println("Quantidade de elementos mapeados: " + hashMap.size());
        }
    }
