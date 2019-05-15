package springboot.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.petclinic.model.Owner;

import java.util.List;

/**
 * Created by max on 2019-04-15
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findByLastNameContaining(String lastName);

}
