package springboot.petclinic.services;

import springboot.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by max on 2019-03-07
 */
public interface VetServices {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
