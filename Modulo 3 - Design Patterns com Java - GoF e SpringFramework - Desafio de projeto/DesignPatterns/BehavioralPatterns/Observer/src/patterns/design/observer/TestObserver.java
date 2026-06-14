package patterns.design.observer;

public class TestObserver {
    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of observer is to have an object that is responsible to update automatically the status of a change
        //for all other objects related

        WeatherApp app = new WeatherApp();

        Observer user1 = new User("user1");
        Observer user2 = new User("user2");
        Observer user3 = new User("user3");

        app.addObserver(user1);
        app.addObserver(user2);
        app.addObserver(user3);

        app.updateWeather("temperature has fallen 5ºC");

        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
