package subsystemA.crm;

public class CRMService {

    private CRMService(){
        super();
    }
    public static void storeClient(String name, String cep, String city, String estate){
        System.out.println("Client stored on CRM system");
    }
}
