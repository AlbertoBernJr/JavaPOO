public class Main
{
	public static void main(String[] args) {
		Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.setcoisadentro("Olá, mundo!"); // Ok
        // caixaTexto.setcoisadentro(123); -> ERRO! Só cabe String.
        String texto = caixaTexto.getcoisadentro(); // Não precisa de casting!
        System.out.println(caixaTexto.getcoisadentro());
        
        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.setcoisadentro(42); // Ok
        int numero = caixaNumero.getcoisadentro(); // Já sai como Integer!
        System.out.println(caixaNumero.getcoisadentro());
	}
}
