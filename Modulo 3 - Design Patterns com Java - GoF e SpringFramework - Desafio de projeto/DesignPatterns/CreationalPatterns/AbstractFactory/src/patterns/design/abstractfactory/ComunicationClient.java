package patterns.design.abstractfactory;

public class ComunicationClient {
    private final Request request;
    private final Response response;

    public ComunicationClient(ComunicationFactory factory) {
        this.request = factory.createRequest();
        this.response = factory.createResponse();
    }

    public void execute() {
        request.sendRequest("Ping request");
        response.handleResponse("Pong response");
    }
}
