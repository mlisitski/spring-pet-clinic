package springboot.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by max on 2019-04-08
 */
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
