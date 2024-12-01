package com.isac.bm.atividade05;

/**
 * @author Isac B.M
 */
public interface Veiculo {
    void acelerar();
    public void frear();
    
    default public void ligar(){
        System.out.println("ligando algo...");
    }
}
