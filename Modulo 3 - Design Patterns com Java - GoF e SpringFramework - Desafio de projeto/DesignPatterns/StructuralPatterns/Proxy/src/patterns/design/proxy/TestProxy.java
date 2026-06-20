package patterns.design.proxy;

public class TestProxy {
    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of Proxy is to controll the access to other object

        Route routeA = new Proxy("adm", "pathA");

        Route routeB = new Proxy("joao", "pathA");

        routeA.enter();
        routeB.enter();
        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
