package com.isac.bm.atividade05;

/**
 * @author Isac B.M
 */
public class Retangulo extends Forma{
    float lado1 = 0;
    float lado2 = 0;
    
    @Override
    public float calcularArea() {
        return lado1 * lado2;
    }
    
}
