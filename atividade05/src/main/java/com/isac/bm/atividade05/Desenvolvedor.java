package com.isac.bm.atividade05;

/**
 * @author Isac B.M
 */
public class Desenvolvedor extends Funcionario{
    
    public Desenvolvedor(String nome, float salario) {
        super(nome, salario);
    }
    
    @Override
    public void calcularBonificacao(){
        float bonificacao = getSalario() * 0.1f;
        System.out.printf("Olá Sr(a) desenvolvedor %s, seja muito bem-vindo(a) ao sistema! \n", getNome());
        System.out.printf("Seu salário atual é de %.2f \n", getSalario());
        System.out.printf("Com a bonificação de %.2f o seu sálario será de: %.2f !\n",bonificacao, (getSalario() + bonificacao));
    }
    
}
