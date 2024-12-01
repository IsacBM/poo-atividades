/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isac.bm.atividade05;

/**
 *
 * @author TEste
 */
public class Circulo extends Forma{
    float raio;

    @Override
    public float calcularArea() {
        return  (float)(Math.PI * Math.pow(raio, 2));
    }

}
