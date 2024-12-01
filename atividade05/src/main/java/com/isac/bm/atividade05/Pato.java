package com.isac.bm.atividade05;

/**
 * @author Isac B.M
 */
public class Pato implements Voador, Nadador{

    @Override
    public void voar() {
        System.out.println("O pato em meio ao lago seco, sobre a sombra de um pinheiro, voou em direção a imensidão do seu coração...");
    }

    @Override
    public void nadar() {
        System.out.println("O Pato está na lagoa!");
    }
    
}
