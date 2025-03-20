import java.util.*;
    public class Main {
        public static void main(String[] args) {
            // criando um LinkedHashMap
            //[<>()] = indica uma lista/dicionário
            LinkedHashMap<String, Integer> diasSemana = new LinkedHashMap<>();
            
            // adicionando elementos do tipo chave x valor
            diasSemana.put("domingo", 1);
            diasSemana.put("segunda", 2);
            diasSemana.put("terça", 3);
            diasSemana.put("quarta", 4);
            diasSemana.put("quinta", 5);
            diasSemana.put("sexta", 6);
            diasSemana.put("sábado", 4);
            
            //[println]= pula Linha 
            //[print]= não pula linha
            System.out.print("Dias da Semana:");
            System.out.print(diasSemana);
        }
    }
