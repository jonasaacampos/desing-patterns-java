package gof.java.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movimento de defesa!");
    }
}
