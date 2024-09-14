package com.isacbm.atividade02;

import java.time.LocalDate;

/**
 * @author Isac B.M - 2K24
 */
public class Atividade02 {

    public static void main(String[] args) {
        Pessoa criarPessoa;
        criarPessoa = new Pessoa(
                "Isac B.M", 
                "222.222.222-22", 
                "isacbm@gmail.com",
                "89981000000", 
                LocalDate.of(2005, 10, 03)
        );
        criarPessoa.exibirDados();
    }
}
