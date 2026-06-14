package patterns.design.observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherApp implements Subject{

    private List<Observer> users = new ArrayList<>();
    private String weatherChange;

    @Override
    public void addObserver(Observer observer) {
        users.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : users) {
            observer.update(weatherChange);
        }
    }

    public void updateWeather(String message) {
        this.weatherChange = message;
        System.out.println("There's a change on the weather: " + message);

        notifyObservers();
    }

}
