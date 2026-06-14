package patterns.design.strategy;

public class TestStrategy {


    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea behind strategy is to emulate and make the context more flexible the actions of and object
        Behavior standardBehavior = new StandardBehavior();
        Behavior defensiveBehavior = new DefensiveBehavior();
        Behavior angryBehavior = new AngryBehavior();

        Robot robot = new Robot();
        robot.setStrategy(standardBehavior);
        robot.move();

        robot.setStrategy(defensiveBehavior);
        robot.move();

        robot.setStrategy(angryBehavior);
        robot.move();

/*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
