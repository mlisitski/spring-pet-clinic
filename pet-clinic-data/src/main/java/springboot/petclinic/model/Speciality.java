package springboot.petclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by max on 2019-04-08
 */

@Data
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;

}
