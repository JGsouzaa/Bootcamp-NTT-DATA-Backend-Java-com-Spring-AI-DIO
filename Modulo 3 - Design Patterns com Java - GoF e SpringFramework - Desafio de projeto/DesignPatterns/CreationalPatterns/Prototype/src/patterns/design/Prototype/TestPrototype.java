package patterns.design.Prototype;

public class TestPrototype {
    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of prototype is to generate a copy of a given object to others
        //avoiding the necessity to recreate the same object

        Person person1 = new Person("Person 1", "Black", 180);

        Person person2 = person1.clone();
        Person person3 = person1.clone();

        if ((person1.getHeight() == person2.getHeight()) && (person2.getHeight() == person3.getHeight())
            && (person1.getHairColor() == person2.getHairColor()) && (person2.getHairColor() == person3.getHairColor())
            && (person1.getName() == person2.getName()) && (person2.getName() == person3.getName())){

            return "OK";
        } else {
            return "FAILED!";
        }
    }
}
