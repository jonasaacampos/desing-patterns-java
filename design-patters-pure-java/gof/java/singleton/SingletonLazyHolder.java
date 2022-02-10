package gof.java.singleton;

/**
 * Singleton detentor da preguiça
 *
 * cria a instância APÓS ser chamada e a retorna
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 * @author jaac
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }

}
