package patterns.design.singleton;


public class TestSingleton {
    public static void main() {
        System.out.println(test());
    }
    public static String test(){

        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();
        Singleton thirdSingleton = Singleton.getInstance();

        if ((firstSingleton == secondSingleton) && (secondSingleton == thirdSingleton)) {
            return "OK";
        } else{
            return "FAILED!";
        }

    }

}
