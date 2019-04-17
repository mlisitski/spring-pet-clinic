package springboot.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.petclinic.model.Vet;

/**
 * Created by max on 2019-04-15
 */
public interface VetRepository extends CrudRepository<Vet, Long> {

}
