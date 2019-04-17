package springboot.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.petclinic.model.Pet;

/**
 * Created by max on 2019-04-15
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
