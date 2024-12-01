package com.isac.bm.atividade05;

/**
 * @author Isac B.M
 */
public class Carro implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("VRUMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM");;
    }

    @Override
    public void frear() {
        System.out.println("DRIFT");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o Veículo...");
    }
    
}
