package patterns.design.Prototype;

public class Person implements Prototype<Person>{

    private String name;
    private String hairColor;
    private int height;

    public Person(String name, String hairColor, int height){
        this.name = name;
        this.hairColor = hairColor;
        this.height = height;
    }

    @Override
    public Person clone() {
        return new Person(name, hairColor, height);
    }

    @Override
    public String toString(){
        return "Person: " +
                name + "\n" +
                "Hair Color: " +
                hairColor + "\n" +
                "Height: " +
                height;
    }

    public String getName(){
        return this.name;
    }

    public String getHairColor(){
        return this.hairColor;
    }

    public int getHeight(){
        return this.height;
    }
}
