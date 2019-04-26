package springboot.petclinic.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;

/**
 * Created by max on 2019-02-25
 */

@Data
@MappedSuperclass
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

}
