public class Main {
    public static void main(String[] args) {
        //utilização de classes wrapper (integer, Double, String, ...)
        Generico g = new Generico();
        
        Integer[] v = { 1, 2, 3, 4};
        g.imprimeElementos(v);
        
        Double[] v2 = { 1.0, 2.0, 3.0, 4.0, 5.0};
        g.imprimeElementos(v2);
        
        Character[] v3 = { 'a', 'e', 'i', 'o', 'u' };
        g.imprimeElementos(v3);
        
        String[] v4 = { "um", "dois", "três", "quatro" };
        g.imprimeElementos(v4);
        
    }
}
