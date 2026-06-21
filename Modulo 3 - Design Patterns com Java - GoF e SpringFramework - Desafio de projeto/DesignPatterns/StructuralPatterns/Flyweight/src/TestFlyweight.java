import java.util.ArrayList;
import java.util.List;

public class TestFlyweight {
    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of Flyweight is to recycle memory using objects that share the same state
        //You use it when you have a lot of objects that shares some properties


        List<Tree> forest = new ArrayList<>();

        TreeType pine = FactoryTree.getType("Pine", "Green");
        TreeType oak = FactoryTree.getType("Oak", "Brown");

        for (int i = 0; i < 10; i++) {

            forest.add(new Tree(i, i + 10, pine));
        }

        forest.add(new Tree(50, 70, oak));
        for (Tree tree : forest) {
            tree.show();
        }

        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
