package springboot.petclinic.services;

import springboot.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by max on 2019-03-07
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
