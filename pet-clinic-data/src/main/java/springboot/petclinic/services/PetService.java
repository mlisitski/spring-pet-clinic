package springboot.petclinic.services;

import springboot.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by max on 2019-03-07
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
