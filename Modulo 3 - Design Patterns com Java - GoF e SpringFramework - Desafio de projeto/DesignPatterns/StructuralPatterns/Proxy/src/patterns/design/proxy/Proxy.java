package patterns.design.proxy;

public class Proxy implements Route{

    private RealRoute realRoute;
    private String route;
    private String user;

    public Proxy(String user, String route){
        this.route = route;
        this.user = user;
    }

    @Override
    public void enter() {
        if (!user.equals("adm")){
            System.out.println("Current user don't have access to that path");
            return;
        }

        if (realRoute == null){
            realRoute = new RealRoute(route);
        }

        realRoute.enter();
    }
}
