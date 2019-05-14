package springboot.petclinic.services;

import springboot.petclinic.model.Owner;

import java.util.List;

/**
 * Created by max on 2019-03-07
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String anyString);
}
