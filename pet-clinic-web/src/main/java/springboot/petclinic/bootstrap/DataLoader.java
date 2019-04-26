package springboot.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springboot.petclinic.model.*;
import springboot.petclinic.services.*;

import java.time.LocalDate;

/**
 * Created by max on 2019-04-01
 */
@Component
public class DataLoader implements CommandLineRunner {


    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) {

        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {

        Speciality specialty1 = new Speciality();
        specialty1.setDescription("Radiology");
        Speciality specialty2 = new Speciality();
        specialty1.setDescription("Surgery");
        Speciality specialty3 = new Speciality();
        specialty1.setDescription("Dentistry");
        specialityService.save(specialty1);
        specialityService.save(specialty2);
        specialityService.save(specialty3);

        PetType dog = new PetType();
        dog.setName("Dog");
        petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Don");
        owner1.setLastName("Capone");
        owner1.setAddress("333 Rose");
        owner1.setCity("Surrey");
        owner1.setTelephone("444-111-2234");

        Pet pet1 = new Pet();
        pet1.setName("Morray");
        pet1.setPetType(dog);
        pet1.setOwner(owner1);
        pet1.setBirthDate(LocalDate.now());
        owner1.getPets().add(pet1);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Max");
        owner2.setLastName("Lis");
        owner2.setAddress("815 Apex");
        owner2.setCity("Burnaby");
        owner2.setTelephone("604-331-3331");

        Pet pet2 = new Pet();
        pet2.setPetType(cat);
        pet2.setOwner(owner2);
        pet2.setName("Viski");
        pet2.setBirthDate(LocalDate.now());
        owner2.getPets().add(pet2);

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Frank");
        vet1.setLastName("Enstein");
        vet1.getSpecialities().add(specialty1);
        vet1.getSpecialities().add(specialty2);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Muchacho");
        vet2.setLastName("Pukacho");
        vet2.getSpecialities().add(specialty2);
        vet2.getSpecialities().add(specialty3);
        vetService.save(vet2);

        Visit visit1 = new Visit();
        visit1.setPet(pet1);
        visit1.setDate(LocalDate.now());
        visit1.setDescription("Sneeze dog");
        visitService.save(visit1);

        System.out.println("Loaded vets in DataLoader class.");
    }
}
