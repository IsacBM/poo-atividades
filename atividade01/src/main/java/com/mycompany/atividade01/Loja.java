package com.mycompany.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Isac B.M - 2K24
 */
public class Loja {
    String nome;
    String endereco;
    List<Produto> produtos;
    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.produtos = new ArrayList<>();
    }
    public void adicionar_produto(Produto produto){
        this.produtos.add(produto); 
    } 
    public void listar_produtos(){
        
        System.out.println("Produto     \tPreco");
        System.out.println("=====================");
        
        for(int i=0; i<=this.produtos.size()-1;i++){
            Produto produto = this.produtos.get(i);
            System.out.println(produto.nome + "\t" + produto.preco);
        }
        System.out.println("=====================\n");
    }
    public void vender_produto(String nome){
        for(int i=0; i<= this.produtos.size()-1; i++){
            Produto produto = this.produtos.get(i);
            if (produto.nome.equals(nome)){
                produtos.remove(i);
            }
        }
    }
}
