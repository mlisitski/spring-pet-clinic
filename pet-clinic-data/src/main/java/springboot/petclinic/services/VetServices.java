package springboot.petclinic.services;

import org.springframework.data.annotation.Id;
import springboot.petclinic.model.Vet;

/**
 * Created by max on 2019-03-07
 */
public interface VetServices extends CrudService<Vet, Id> {

}
