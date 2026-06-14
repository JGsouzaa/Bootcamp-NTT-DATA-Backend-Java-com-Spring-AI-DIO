package patterns.design.templatemethod;

public class Pepperoni extends Pizza{

    public Pepperoni(String name) {
        super(name);
    }

    @Override
    protected void assemble(){
        System.out.println("Spicy, salty sliced sausage was added!");
    }

}
