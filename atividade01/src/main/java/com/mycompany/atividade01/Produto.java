package com.mycompany.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Isac B.M - 2K24
 */
public class Produto {
    
    String nome;
    float preco;
    
    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }    
    
    public String pegarNome(){
        return nome;
    }
    public float pegarPreco(){
        return preco;
    }
    
}
