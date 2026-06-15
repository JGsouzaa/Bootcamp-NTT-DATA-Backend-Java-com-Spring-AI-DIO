package patterns.design.facade;

import subsystemA.crm.CRMService;
import subsystemB.cep.CEPAPI;

public class Facade {

    public void migrateClient(String name, String cep){
        String city = CEPAPI.getInstance().recoverCity(cep);
        String estate = CEPAPI.getInstance().recoverEstate(cep);

        CRMService.storeClient(name, cep, city, estate);

        System.out.println("The client: "
                + name
                + "\nFrom cep: "
                + cep
                + "\nHas being migrated to"
                + "\nCity: "
                + city
                + "\nEstate: "
                + estate);

    }



}
