package springboot.petclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by max on 2019-02-25
 */


@Data
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    private String name;

}
