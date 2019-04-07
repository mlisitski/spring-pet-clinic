package springboot.petclinic.services.map;

import org.springframework.stereotype.Service;
import springboot.petclinic.model.Pet;
import springboot.petclinic.services.PetService;

import java.util.Set;

/**
 * Created by max on 2019-03-26
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }


    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
