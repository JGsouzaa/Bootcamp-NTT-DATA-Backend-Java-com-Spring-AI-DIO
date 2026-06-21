package patterns.design.bridge;

public abstract class BridgeAbstraction {

    protected Channel channel;

    public BridgeAbstraction(Channel channel){
        this.channel = channel;
    }

    public abstract void sendMessage(String message);

}
