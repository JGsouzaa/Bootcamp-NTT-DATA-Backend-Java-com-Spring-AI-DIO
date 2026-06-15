package patterns.design.facade;

public class TestFacade {

    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea for Facade is to provide a simpler interface abstracting the complexity of others

        Facade facade = new Facade();
        facade.migrateClient("José", "9042030");


        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
