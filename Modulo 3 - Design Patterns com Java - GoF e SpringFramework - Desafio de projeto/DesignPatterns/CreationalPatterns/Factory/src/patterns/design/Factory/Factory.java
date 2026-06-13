package patterns.design.Factory;

import java.util.Objects;

public class Factory {
    public static Request createHttp() {
        return new Http();
    }

    public static Request createMqtt() {
        return new Mqtt();
    }
}

