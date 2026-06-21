package patterns.design.bridge;

public class NormalNotification extends BridgeAbstraction{

    public NormalNotification(Channel channel){
        super(channel);
    }


    @Override
    public void sendMessage(String message) {
        channel.sendMessage(message);
    }
}
