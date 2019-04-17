package springboot.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.petclinic.model.PetType;

/**
 * Created by max on 2019-04-15
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
