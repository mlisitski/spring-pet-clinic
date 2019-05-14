package springboot.petclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springboot.petclinic.model.Owner;
import springboot.petclinic.repositories.OwnerRepository;
import springboot.petclinic.services.OwnerService;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by max on 2019-04-15
 */
@Service
//workaround to avoid beans collision
@Profile("jpa")
public class OwnerJPAService implements OwnerService {

    private final OwnerRepository ownerRepository;

    public OwnerJPAService(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }


    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }


    @Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return ownerRepository.findAllByLastNameLike(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        //return null if Owner does not exist
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
