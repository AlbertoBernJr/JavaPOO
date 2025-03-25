// Caixa genérica com rótulo <T> (pode ser qualquer tipo)
class Caixa<T> {  // [T] significa [Tipo] (pode ser String, Integer, etc.)
    private T coisadentro;

    public void setcoisadentro(T coisadentro) {
        this.coisadentro = coisadentro;
    }

    public T getcoisadentro() {
        return coisadentro;
    }
}
