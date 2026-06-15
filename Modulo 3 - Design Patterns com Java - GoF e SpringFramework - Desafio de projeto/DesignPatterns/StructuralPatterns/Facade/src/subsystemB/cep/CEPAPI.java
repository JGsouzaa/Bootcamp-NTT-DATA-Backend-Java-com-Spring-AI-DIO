package subsystemB.cep;

public class CEPAPI {

    private static CEPAPI instance = new CEPAPI();

    private CEPAPI(){
        super();
    }

    public static CEPAPI getInstance(){
        return instance;
    }

    public String recoverCity(String cep){
        return "Curitiba";
    }

    public String recoverEstate(String cep){
        return "PR";
    }

}
