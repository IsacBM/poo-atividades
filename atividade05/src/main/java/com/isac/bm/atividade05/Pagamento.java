package com.isac.bm.atividade05;

/**
 * @author Isac B.M
 */
public abstract class Pagamento {
    float valorDoPagamento;
    float valorPago;
    String dataPagamento;
    
    public abstract void processarPagamento();
}
