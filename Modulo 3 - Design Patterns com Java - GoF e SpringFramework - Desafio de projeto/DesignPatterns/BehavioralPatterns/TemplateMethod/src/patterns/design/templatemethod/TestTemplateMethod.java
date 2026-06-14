package patterns.design.templatemethod;

public class TestTemplateMethod {

    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of TemplateMethod is to have a general logic with little flexibility that is handled by subclasses

        Pizza pepperoni = new Pepperoni("Pepperoni");
        Pizza mozzarella = new Mozzarella("Mozzarella");

        pepperoni.make();
        mozzarella.make();


        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
