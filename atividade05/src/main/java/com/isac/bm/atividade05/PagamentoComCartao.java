package com.isac.bm.atividade05;

/**
 * @author Isac B.M - 2K24
 */
public class PagamentoComCartao extends Pagamento implements Cartao{

    @Override
    public void processarPagamento() {
        System.out.printf("Iniciando processamento de pagamento com cartão no valor de R$%.2f \n", valorDoPagamento);
        if(valorPago == valorDoPagamento){
            autorizar();
        } else{
            estornar();
        }
    }

    @Override
    public void autorizar() {
        System.out.printf("Pagamento autorizado! Valor pago: %.2f na data de %s. \n", valorPago, dataPagamento);
    }

    @Override
    public void estornar() {
        if(valorPago < valorDoPagamento){
            System.out.println("Pagamento bloqueado! Saldo insuficiente para completar essa ação :(");
        } else{
            System.out.println("Pagamento bloqueado! Valor estornado de volta ao cartão!");
        }
    }
    
}
