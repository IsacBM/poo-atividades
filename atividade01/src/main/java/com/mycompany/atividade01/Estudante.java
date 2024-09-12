package com.mycompany.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Isac B.M - 2K24
 */
public class Estudante {
    String nome;
    String matricula;
    float nota;
    
    public Estudante(String nomeAluno, String matriculaAluno, float notaAluno){
        this.nome = nomeAluno;
        this.matricula = matriculaAluno;
        this.nota = notaAluno;
    }
    
    public float pegarNota(){
        return nota;
    }
    
}
