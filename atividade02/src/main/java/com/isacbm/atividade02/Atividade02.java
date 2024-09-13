package com.isacbm.atividade02;

/**
 * @author Isac B.M - 2K24
 */
public class Atividade02 {

    public static void main(String[] args) {
        Pessoa criarPessoa;
        criarPessoa = new Pessoa("Isac B.M", "145.382.206-20", "isacbm@gmail.com", "89981468171");
        
        System.out.println(criarPessoa.getNome());
        System.out.println(criarPessoa.getTelefone());
        System.out.println(criarPessoa.getEmail());
        System.out.println(criarPessoa.getCpf());
    }
}
