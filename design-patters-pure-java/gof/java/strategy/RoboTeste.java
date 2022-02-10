package gof.java.strategy;

public class RoboTeste {
    public static void main(String[] args) {

        Comportamento defesa = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento ataque = new ComportamentoAtaque();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defesa);
        robo.mover();

        robo.setComportamento(ataque);
        robo.mover();
        robo.mover();


    }
}
