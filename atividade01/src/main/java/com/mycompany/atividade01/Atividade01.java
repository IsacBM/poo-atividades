package com.mycompany.atividade01;

/**
 *
 * @author Isac B.M - 2K24
 */
public class Atividade01 {

    public static void main(String[] args) {
        
        System.out.println("Primeira Questao: \n");
        // Primeira Questão:
        
        Carro verCarro = new Carro();
        
        verCarro.marca = "Chevrolet";
        verCarro.ano = 2023;
        verCarro.modelo = "Corvette";
        verCarro.cor = "Laranja";
        
        System.out.println("| Marca: " + verCarro.marca);
        System.out.println("| Modelo: " + verCarro.modelo);
        System.out.println("| Ano: " + verCarro.ano);
        System.out.println("| Cor: " + verCarro.cor);
        
        //
        System.out.println("\n");
        System.out.println("Segunda Questao: \n");
        // Segunda Questão:
        
        String nomeTitulo = "Livro do Isac";
        String nomeAutor = "Isac B.M";
        int numPaginas = 200;
        
        Livro verLivro = new Livro(nomeTitulo, nomeAutor, numPaginas);
        
        verLivro.descricaoLivro();
        
        //
        System.out.println("\n");
        System.out.println("Terceira Questao: \n");
        // Terceira Questão:
        
        String nome = "Isac";
        float saldoConta = 5000;
        
        ContaBancaria conta = new ContaBancaria(nome, saldoConta);
        
        System.out.println(conta.depositarValor(200));
        System.out.println(conta.sacarValor(200));
        System.out.println(conta.sacarValor(5000));
        
        //
        System.out.println("\n");
        System.out.println("Quarta Questao: \n");
        // Quarta Questão:
        
        Produto verProduto[] = {new Produto("Funko POP", 180), new Produto("Mouse", 30), new Produto("Notebook", 4000)};
        
        System.out.println("|---------------------|");
        System.out.println("| Nome     \tPreco |");
        System.out.println("|---------------------|");
        
        for(int i = 0; i < verProduto.length; i++){
            System.out.println("| " + verProduto[i].pegarNome() + "\t" + verProduto[i].pegarPreco() + " |");
        }
        System.out.println("-----------------------\n");
        
        //
        System.out.println("\n");
        System.out.println("Quinta Questao: \n");
        // Quinta Questão:
        
        Loja minhaLoja = new Loja("feiradoparaguai.com.br", "Ponte Internacional da Amizade");
        Produto produto1 = new Produto("Caixa JBL", 80);
             
        minhaLoja.adicionar_produto(produto1);
        minhaLoja.adicionar_produto(new Produto("iWatch", 100));
        minhaLoja.adicionar_produto(new Produto("Copo Stanley", 30));
        
        minhaLoja.listar_produtos();
        minhaLoja.vender_produto("iWatch");
        
        minhaLoja.listar_produtos();
        
        //
        System.out.println("\n");
        System.out.println("Sexta Questao: \n");
        
        Turma verTurma = new Turma();

        verTurma.adicionarAluno(new Estudante("Isac B.M", "2024114TADS1", 9.5f));
        verTurma.adicionarAluno(new Estudante("Zacks", "2024114TADS2", 10));
        verTurma.adicionarAluno(new Estudante("Kass♥", "2024114TADS3", 9.5f));

        System.out.println("A média da turma é " + verTurma.media_turma());
    }
}
