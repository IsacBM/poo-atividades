package com.isac.bm.atividade05;

/**
 * @author Isac B.M
 */
public class Bicicleta  implements Veiculo{

    @Override
    public void acelerar() {
        System.out.println("FIUMMMMMMMMMMMMMMMMMMMMMM");
    }

    @Override
    public void frear() {
        System.out.println("SIHHHHHH");
    }

    @Override
    public void ligar() {
        System.out.println("Enchendo os Pneus...");
    }
    
}
