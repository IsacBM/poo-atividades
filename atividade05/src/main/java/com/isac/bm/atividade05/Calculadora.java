/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isac.bm.atividade05;

/**
 *
 * @author TEste
 */
public class Calculadora {
    
    
    class Operacoes implements OperacaoMatematica{

        @Override
        public float adicionar(int a, int b) {
            return a+ b;
        }

        @Override
        public float multiplicar(int a, int b) {
            return a * b;
        }
        
    }
    
            
         public final Operacoes operacoes() {
                return new Operacoes();
    }
    
}
