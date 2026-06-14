package patterns.design.templatemethod;

public class Mozzarella extends Pizza {

    public Mozzarella(String name) {
        super(name);
    }

    @Override
    protected void assemble(){
        System.out.println("Simple blend of gooey cheese and red sauce was added!");
    }
}
