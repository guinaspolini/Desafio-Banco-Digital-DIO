
package codigos;

/**
 *
 * @author guilherme naspolini
 *  www.linkedin.com/in/guinaspolini
 */
public class ContaCorrente extends Conta {
    
    @Override    
    public void imprimirExtrato() {
        System.out.println("-------------------------------------");
        System.out.println("-------Banco Nacionale di Naspo------");
        System.out.println("-------------------------------------");
        System.out.println("--------------Extrato----------------");
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("----------------------------");
        System.out.println("-----------Fim do Extrato-------------");
    }
    
    public ContaCorrente(String nome){
        this.titular = nome;
    }
    
      
    
}
