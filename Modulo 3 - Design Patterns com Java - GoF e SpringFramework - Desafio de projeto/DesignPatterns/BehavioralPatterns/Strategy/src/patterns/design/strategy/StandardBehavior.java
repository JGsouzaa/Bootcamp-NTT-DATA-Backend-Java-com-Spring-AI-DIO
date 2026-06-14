package patterns.design.strategy;

public class StandardBehavior implements Behavior{

    @Override
    public void move() {
        System.out.println("Standard moving");
    }
}
