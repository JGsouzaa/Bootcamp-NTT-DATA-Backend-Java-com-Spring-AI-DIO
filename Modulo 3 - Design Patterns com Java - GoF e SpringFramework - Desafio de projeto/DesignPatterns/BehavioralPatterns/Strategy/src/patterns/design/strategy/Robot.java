package patterns.design.strategy;

public class Robot {
    private Behavior strategy;

    public void move(){
        strategy.move();
    }

    public void setStrategy(Behavior strategy){
        this.strategy = strategy;
    }
}
