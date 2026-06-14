package patterns.design.abstractfactory;



public class AbstractHttpFactory implements ComunicationFactory{
    @Override
    public Request createRequest() {
        return new HttpRequest();
    }

    @Override
    public Response createResponse() {
        return new HttpResponse();
    }
}
