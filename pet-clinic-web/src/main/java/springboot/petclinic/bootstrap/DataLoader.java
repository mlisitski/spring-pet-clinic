package springboot.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springboot.petclinic.model.Owner;
import springboot.petclinic.model.Vet;
import springboot.petclinic.services.OwnerService;
import springboot.petclinic.services.VetService;
import springboot.petclinic.services.map.OwnerServiceMap;
import springboot.petclinic.services.map.VetServiceMap;

/**
 * Created by max on 2019-04-01
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();

    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Don");
        owner1.setLastName("Capone");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Max");
        owner2.setLastName("Lis");

        ownerService.save(owner2);

        System.out.println("Loaded owners in DataLoader.");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Frank");
        vet1.setLastName("Enstein");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Muchacho");
        vet2.setLastName("Pukacho");

        vetService.save(vet2);

        System.out.println("Loaded vets in DataLoader.");

    }
}