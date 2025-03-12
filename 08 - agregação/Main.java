public class Main {
    public static void main(String[] args) {
        Lutador lut[]=new Lutador [3];
        //uso de vetor para não ter que chamar a classe [lutador()] toda vez
        //limitou o numero de vetores a serem criados para [3] -> de 0 a 2

        lut[1]=new Lutador("Jackson", "Bahia",
                47, 1.75f, 70.5f, 11, 4,
                2);
        lut[2]=new Lutador("Geovanna", "MG", 37,
                1.80f, 70.8f, 9, 5, 3);

        Luta UF=new Luta();
        UF.marcarluta(lut[1], lut[2]);
        UF.lutar();

        lut[1].status();
        lut[2].status();
    }
}
