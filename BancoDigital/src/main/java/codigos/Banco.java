/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigos;

/**
 *
 * @author guilherme
 */
public class Banco {
    public static void main (String[] args){
    
        ContaCorrente guilherme = new ContaCorrente("Guilherme");
        ContaCorrente kalita = new ContaCorrente("Kalita");
        
        guilherme.imprimirExtrato();
        kalita.imprimirExtrato();
        
        guilherme.sacar(1000);
        
        guilherme.depositar(13499);
        
        guilherme.transferir(10000, kalita);
        
        guilherme.imprimirExtrato();
        kalita.imprimirExtrato();
        
    }
    
}
