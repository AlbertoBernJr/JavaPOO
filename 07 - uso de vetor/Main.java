public class Main {
    public static void main(String[] args) {
        Lutador lut[]=new Lutador [2];
        //uso de vetor para não ter que chamar a classe [lutador()] toda vez
        //limitou o numero de vetores a serem criados para [2] -> de 0 a 1

        lut[1]=new Lutador("Jackson", "Bahia",
                47, 1.75f, 70.5f, 11, 4,
                2);
        lut[1].apresentar();
        lut[1].empatarluta();
        lut[1].status();
    }
}
