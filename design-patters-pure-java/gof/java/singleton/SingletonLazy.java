package gof.java.singleton;

/**
 * Singleton com preguiça
 *
 * cria a instância APÓS ser chamada e a retorna
 *
 * @author jaac
 */

public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }


}
