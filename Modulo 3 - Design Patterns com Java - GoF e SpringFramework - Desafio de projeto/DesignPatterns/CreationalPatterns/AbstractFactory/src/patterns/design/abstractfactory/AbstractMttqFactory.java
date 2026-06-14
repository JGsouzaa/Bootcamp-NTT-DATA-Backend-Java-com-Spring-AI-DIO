package patterns.design.abstractfactory;

public class AbstractMttqFactory implements ComunicationFactory{
    @Override
    public Request createRequest() {
        return new MttqRequest();
    }

    @Override
    public Response createResponse() {
        return new MttqResponse();
    }
}
