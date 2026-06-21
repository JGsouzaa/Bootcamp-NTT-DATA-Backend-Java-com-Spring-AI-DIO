package patterns.design.bridge;

public class CriticalNotification extends BridgeAbstraction {
    public CriticalNotification(Channel channel){
        super(channel);
    }

    @Override
    public void sendMessage(String message) {
        channel.sendMessage(message);
    }

}
