package springboot.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import springboot.petclinic.model.Speciality;

/**
 * Created by max on 2019-04-15
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
