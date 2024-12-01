package com.isac.bm.atividade05;

/**
 * @author Isac B.M - 2K24
 */
public class PagamentoBoleto extends Pagamento{

    @Override
    public void processarPagamento() {
        System.out.printf("Processando pagamento por boleto no valor de R$ %.2f\n", valorDoPagamento);
        System.out.printf("Pagamento realizado com sucesso!! Valor pago: %.2f Data: %s\n", valorPago, dataPagamento);
    }
    
}
