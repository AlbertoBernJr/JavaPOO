public class ContaBanco {
    private int nConta;
    protected String tipoConta;
    private String dono;
    private float saldo;
    private boolean status;

    //--------------mostrar o estado atual da conta--------------
    public void estadoAtual(){
        System.out.println("------------------------------");
        System.out.println("Numero da conta: "+this.getnConta());
        System.out.println("Dono: "+this.getdono());
        System.out.println("Tipo de conta: "+this.gettipoConta());
        System.out.println("Saldo atual: "+this.getsaldo());
        System.out.println("Status da conta: "+this.getstatus());
        System.out.println("------------------------------");
    }

    //------------------metodos personalizados--------------------
    public void abrirConta(String tipoConta){
        this.settipoConta(tipoConta);
        this.setstatus(true);

        if("CC".equals(tipoConta)){// usar [.equals] ao inves de [==]
            this.setsaldo(50);
            //se a conta for corrente, receberá R$50
        }else if("CP".equals(tipoConta)){
            this.setsaldo(150);
            //se a conta for poupança, recebrá R$150
        }
        System.out.println("Conta foi aberta!");
    }
    //--------------------------
    public void fecharConta(){
        //verificar se o saldo esta positivo/negativo + so fechar se o [saldo] for igaul a 0
        if(this.getsaldo()>0) {
            System.out.println("Conta não pode ser fechada porque ainda tem $ dentro");
        }else if(this.getsaldo()<0){
            System.out.println("A conta não pode ser fechada porque está com dívidas");

        }else{
            //a conta esta vazia e não tem dividas
            this.setstatus((false));
            System.out.println("A conta foi encerrada!");
        }

    }
    //--------------------------
    public void depositar(float valor){
        if(this.getstatus()){
            this.setsaldo(this.getsaldo()+valor);
            //o [valor] será somado ao saldo anterior

            System.out.println("Deposito de "+valor+" foi realizado na conta de "+this.getdono());
        }else{
            System.out.println("Não é possível depositar em uma conta fechada");
        }
    }
    //--------------------------
    public void sacar(float valor){
        //verificar se o [status] esta [true]/ativada
        if(this.getstatus()){

            //querendo sacar o valor exato ou menos
            if(this.getsaldo()>=valor){
                this.setsaldo(this.getsaldo()-valor);
                //subtrai o [valor] do saldo
                System.out.println("saque de "+valor+" 
