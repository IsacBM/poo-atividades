package com.mycompany.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Isac B.M - 2K24
 */
public class Turma {
    
    float mediaTotal = 0;
    List<Estudante> notasAlunos;
    
    public Turma(){
        this.notasAlunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Estudante aluno){
        this.notasAlunos.add(aluno);
    }
    public float media_turma(){
        for(int i = 0; i < this.notasAlunos.size(); i++){
            mediaTotal = mediaTotal + this.notasAlunos.get(i).pegarNota();
        }
        return mediaTotal / notasAlunos.size();
    }
}
