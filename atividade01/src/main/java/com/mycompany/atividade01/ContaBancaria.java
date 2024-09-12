package com.mycompany.atividade01;
/**
 * @author Isac B.M - 2K24
 */
public class ContaBancaria {
    
    String nomeTitular;
    float saldoTitular;
    
    public ContaBancaria(String nome, float saldoConta){
        this.nomeTitular = nome;
        this.saldoTitular = saldoConta;
    }
    
    String depositarValor(float valor){
        this.saldoTitular = this.saldoTitular + valor;
        return "Ola Sr(a) " + this.nomeTitular+"! O seu valor atual em Conta e " + this.saldoTitular;
    }
    
    String sacarValor(float valor){
        if(this.saldoTitular >= valor){
            this.saldoTitular = this.saldoTitular - valor;
            return "Saque Finalizado! Seu saldo atual é " + this.saldoTitular;
        } else{
            return "Você não possui saldo suficiente :( Seu saldo e " + this.saldoTitular;
        }
    }
}
