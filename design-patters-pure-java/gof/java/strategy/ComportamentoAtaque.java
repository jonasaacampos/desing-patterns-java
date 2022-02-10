package gof.java.strategy;

public class ComportamentoAtaque implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Ataque!");
    }
}
