package codigos;

public abstract class Conta implements InterfaceConta { 
    
    protected static int AGENCIA_PADRAO = 3155;
    protected static int SEQUENCIAL = 14000;
    
    protected String titular;
    protected int agencia;
    protected int numeroConta;
    protected int saldo;
 
    public Conta(){
   
    this.agencia = AGENCIA_PADRAO;
    this.numeroConta = SEQUENCIAL++;
    
    }
    
    
    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor) {
        if(this.saldo >= valor){
        saldo -= valor;
        System.out.println("-------Saque Realizado--------");
        } else
            System.out.println("Saque Indisponivel. Saldo Insuficiente");
        
     }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito de " + valor + " na conta de " + this.titular + " efetuado com sucesso.");
        System.out.println("----------------------------");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if(this.saldo >= valor){
            this.sacar(valor);
            contaDestino.depositar(valor);
            
        } else 
            System.out.println("Não é possível transferir, saldo indisponível.");
            System.out.println("----------------------------");
            
    }  
}
