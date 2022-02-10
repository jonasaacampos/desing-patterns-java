package gof.java.facade;

public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.migrarCliente("Jonas", "123456-789");
    }
}
