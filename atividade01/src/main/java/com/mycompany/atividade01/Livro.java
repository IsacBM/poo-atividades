package com.mycompany.atividade01;

/**
 * @author Isac B.M - 2K24
 */
public class Livro {
    
    String titulo;
    String autor;
    int paginas;
    
    public Livro(String nomeTitulo, String nomeAutor, int numPaginas){
        this.titulo = nomeTitulo;
        this.autor = nomeAutor;
        this.paginas = numPaginas;
    }
    
    void descricaoLivro(){
        System.out.println("| Titulo: " + this.titulo);
        System.out.println("| Autor: " + this.autor);
        System.out.println("| Páginas: " + this.paginas);
    }
    
}
