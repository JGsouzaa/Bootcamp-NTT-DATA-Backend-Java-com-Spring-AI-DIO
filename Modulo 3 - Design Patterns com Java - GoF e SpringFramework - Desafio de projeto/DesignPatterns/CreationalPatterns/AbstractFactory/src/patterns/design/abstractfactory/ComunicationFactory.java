package patterns.design.abstractfactory;

public interface ComunicationFactory {

    Request createRequest();
    Response createResponse();
}
