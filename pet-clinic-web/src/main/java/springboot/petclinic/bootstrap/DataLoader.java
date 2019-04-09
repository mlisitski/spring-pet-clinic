package springboot.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springboot.petclinic.model.Owner;
import springboot.petclinic.model.PetType;
import springboot.petclinic.model.Vet;
import springboot.petclinic.services.OwnerService;
import springboot.petclinic.services.PetTypeService;
import springboot.petclinic.services.VetService;

/**
 * Created by max on 2019-04-01
 */
@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        petTypeService.save(cat);
        System.out.println("Loaded pet types in DataLoader class.");


        Owner owner1 = new Owner();
        owner1.setFirstName("Don");
        owner1.setLastName("Capone");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Max");
        owner2.setLastName("Lis");
        ownerService.save(owner2);

        System.out.println("Loaded owners in DataLoader class.");


        Vet vet1 = new Vet();
        vet1.setFirstName("Frank");
        vet1.setLastName("Enstein");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Muchacho");
        vet2.setLastName("Pukacho");
        vetService.save(vet2);

        System.out.println("Loaded vets in DataLoader class.");

    }
}
