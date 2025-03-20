import java.util.*;
public class Main{
	public static void main(String[] args) {
		HashMap hashmap=new HashMap();
		
		String numeros[]={"um", "dois","tres"};
		//vetor com os nomes das chaves (key)
		
		for(int i=0; i<3;i++){
		//inserindo os elementos
		    hashmap.put(numeros[i], i+1);
		}
		for(int i=0;i<5;i++){
		    System.out.println("chave (key): "+numeros[i]+" | valor: "+hashmap.get(numeros[i]));
		}
	}
}
