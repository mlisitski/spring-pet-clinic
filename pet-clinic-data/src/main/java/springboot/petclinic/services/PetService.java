package springboot.petclinic.services;

import org.springframework.data.annotation.Id;
import springboot.petclinic.model.Pet;

/**
 * Created by max on 2019-03-07
 */
public interface PetService extends CrudService<Pet, Id> {



}
