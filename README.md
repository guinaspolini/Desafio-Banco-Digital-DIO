# Desafio-Banco-Digital-DIO

#### Projeto criado na IDE NetBeans

Criação de um Banco Digital em Java para o desafio na DIO.

São três Classes: Banco e Conta e ContaCorrente (que herda de Conta).

A classe Banco é onde está o Main.

 ## Criando Novas Contas
 
Para criar uma nova conta, instancie **Contacorrrente** passando como argumento o nome do titular.O  da conta será automaticamente iniciado em 14000, aumentando de forma sequencial conforme novas contas são criadas.

**Exemplo:**  <code>ContaCorrente contaJoao = new ContaCorrente("João"); </code>
ou
              <code>ContaCorrente contaPatricia = new ContaCorrente("Patricia");</code>

## Realizando Tarefas - Extrato

Para realizar consulta ao extrato, apenas chame o método **.imprimirExtrato()** após o nome da conta desejada. (Na Classe Banco, existe algumas conta e tarefas criadas).

**Exemplo:** <code>contaJoao.imprimirExtrato();</code>

Formato Extrato: 



  
-------Banco Nacionale di Naspo------
    
--------------Extrato----------------
  
Titular: Kalita
  
Saldo: 0
  
  
## Realizando Tarefas - Transferência

Para transfêrir dinheiro, chame o método **.transferir()**, passando dois argumentos: 

* Primeiro argumento é o valor da transfêrencia.
* Segundo argumento é a conta de destino. **(Não é o nome do titular, e sim o nome do objeto instanciado de ContaCorrente)**.

**Exemplo:** <code>contaJoao.transferir(128, contaPatricia);</code>

**Nota-se: Caso não haja saldo suficiente, uma mensagem aparecerá e a transferência não será completa.**

## Realizando Tarefas - Saque e Depósito

Saques e depósitos estão no mesmo item, pois são chamados de forma idêntica. Chama-se o método **.sacar()** ou **.depositar()**, com o argumento valor da transação.

**Exemplo:** <code> contaJoao.sacar(1500);</code>

Está sendo desenvolvido a mesma aplicação, porém com interface gráfica.

[Linkedin](https://www.linkedin.com/in/guinaspolini)
