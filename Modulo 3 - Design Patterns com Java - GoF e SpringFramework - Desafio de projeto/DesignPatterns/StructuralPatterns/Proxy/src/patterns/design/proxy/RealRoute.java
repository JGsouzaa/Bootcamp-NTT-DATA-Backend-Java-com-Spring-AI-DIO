package patterns.design.proxy;

public class RealRoute implements Route{

    private String path;

    public RealRoute(String pathname){
        this.path = pathname;
    }

    @Override
    public void enter() {
        System.out.println("Entering path: " + path);
    }
}
