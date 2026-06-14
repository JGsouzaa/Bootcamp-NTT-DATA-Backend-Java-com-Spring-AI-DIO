package patterns.design.strategy;

public class AngryBehavior implements Behavior{

    @Override
    public void move() {
        System.out.println("Angry moving");
    }
}
