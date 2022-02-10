package gof.java.singleton;

/**
 * Singleton apressadinho
 *
 * cria a instância antes de ser chamada, e mostra somente o retorno
 *
 * @author jaac
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }


}
