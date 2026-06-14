package patterns.design.templatemethod;

public abstract class Pizza {

    private String name;

    public Pizza(String name){
        this.name = name;
    }

    public final void make(){
        prepareDough();

        strechDough();

        assemble();

        bake();

        serve();
    }

    private void prepareDough(){
        System.out.println("Dough is beeing prepared...");
    }

    private void strechDough(){
        System.out.println("Dough is beeing streched...");
    }

    protected abstract void assemble();

    private void bake(){
        System.out.println("Pizza is baking...");
    }

    private void serve(){
        System.out.println("Pizza " + this.name + " is ready! Serving...\n");
    }
}
