package com.isac.bm.atividade05;

/**
 * @author Isac B.M
 */

public class Atividade05 {
    public static void main(String[] args) {
        
        // 1- Questões:                                           //
        
          Animal cachorro = new Cachorro();
          Animal gato = new Gato();
          System.out.println("/---------------| 1- Questão  |---------------/");
          System.out.print("Som do Gato: ");
          gato.fazerSom();
          System.out.print("Som do Cachorro: ");
          cachorro.fazerSom();
          //------------------------------------------//
          
          System.out.println("/------------------------------------------/");
          
          // 2- Questões:                                           //
          
          Veiculo carro = new Carro();
          Veiculo bike = new Bicicleta();
          
          System.out.println("/---------------| 2- Questão  |---------------/");
          
          System.out.print("Som de Acelerar no Carro: ");
          carro.acelerar();
          System.out.print("Som de Frear no Carro: ");
          carro.frear();
          
          System.out.print("Som de Acelerar na Bike: ");
          bike.acelerar();
          System.out.print("Som de Frear na Bike: ");
          bike.frear();
          //------------------------------------------//
          
          // 3- Questões:                                           //
          
          Pato pato = new Pato();
          
          System.out.println("/---------------| 3- Questão  |---------------/");
          
          System.out.print("Poesia do Pato:");
          pato.voar();
          System.out.print("Pato de boas: ");
          pato.nadar();
          
          //------------------------------------------//
          
          // 5- Questões:                                           //
          
          Veiculo carro2 = new Carro();
          Veiculo bike2 = new Bicicleta();
          
           System.out.println("/---------------| 5- Questão  |---------------/");
          
          System.out.print("Som de Acelerar no Carro: ");
          carro.acelerar();
          System.out.print("Som de Frear no Carro: ");
          carro.frear();
          System.out.print("Som do Carro ligando: ");
          carro.ligar();
          
          System.out.print("Som de Acelerar na Bike: ");
          bike.acelerar();
          System.out.print("Som de Frear na Bike: ");
          bike.frear();
          System.out.print("Som da Bike ligando: ");
          bike.ligar();
          
          //------------------------------------------//
          
          // 6- Questões:                                           //
          
          Retangulo r = new Retangulo();
          r.lado1 = 5;
          r.lado2 = 6;
          
          Circulo c = new Circulo();
          c.raio = 2;
          
          Triangulo t = new Triangulo();
          t.lado1 = 4;
          t.lado2 = 4;
          
          Forma[] formas = new Forma[3];
          
          formas[0] = r;
          formas[1] = c;
          formas[2] = t;
          
          
           System.out.println("/---------------| 6- Questão  |---------------/");
          
          for(Forma forma : formas ){ 
            areaBidimensional(forma);
          }
          
          
          //------------------------------------------//
          
          //7- Questão:                                           //
          System.out.println("/---------------| 7- Questão  |---------------/");
          
          Funcionario gerente = new Gerente("Zacks", 7700.70f);
          Funcionario desenvolvedor = new Desenvolvedor("Isac B.M", 3500.00f);

          gerente.calcularBonificacao();
          System.out.println("|---------------------------------------|");
          desenvolvedor.calcularBonificacao();
          
          //------------------------------------------//
          
          //8- Questão:                                           //
          System.out.println("/---------------| 8- Questão  |---------------/");
          
          Calculadora calc = new Calculadora();

          System.out.print("Somar: ");
          System.out.println(calc.operacoes().adicionar(2,2));
          System.out.print("Multiplicar: ");
          System.out.println(calc.operacoes().multiplicar(2,6));
          
          //------------------------------------------//
          
          //9- Questão:                                           //
          System.out.println("/---------------| 9- Questão  |---------------/");
          
          Pagamento pagCartao = new PagamentoComCartao();
          
          System.out.println("Pagamento com cartão autorizado:");
          pagCartao.dataPagamento = "07/07/2027";
          pagCartao.valorDoPagamento = 250.00f;
          pagCartao.valorPago = 250.00f;
          pagCartao.processarPagamento();
          
          System.out.println("\nPagamento com cartão valor estornado:");
          pagCartao.dataPagamento = "07/07/2027";
          pagCartao.valorDoPagamento = 250.00f;
          pagCartao.valorPago = 270.00f;
          pagCartao.processarPagamento();
          
          System.out.println("\nPagamento com cartão com saldo insuficiente:");
          pagCartao.dataPagamento = "07/07/2027";
          pagCartao.valorDoPagamento = 250.00f;
          pagCartao.valorPago = 249.00f;
          pagCartao.processarPagamento();
          
          System.out.println("\nPagamento com Boleto:");
          
          Pagamento pagBoleto = new PagamentoBoleto();
          
          pagBoleto.dataPagamento = "03/10/2024";
          pagBoleto.valorPago = 550.5f;
          pagBoleto.valorDoPagamento = 550.5f;
          
          pagBoleto.processarPagamento();
          
          //------------------------------------------//
}
    public static void areaBidimensional(Forma objeto){
                    if (objeto instanceof Retangulo){
                        System.out.print("A area do retangulo e ");
                        Retangulo o = (Retangulo) objeto;
                        System.out.println(o.calcularArea());
                    }
                    if (objeto instanceof Circulo){
                        System.out.print("A area do circulo e ");
                        Circulo o = (Circulo) objeto; 
                        System.out.println(o.calcularArea());
                    }
                    if (objeto instanceof Triangulo){
                        System.out.print("A area do circulo e ");
                        Triangulo o = (Triangulo) objeto; //casting ou coerção
                        System.out.println(o.calcularArea());
                    }
          }
}
