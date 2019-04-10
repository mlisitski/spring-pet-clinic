package springboot.petclinic.model;

/**
 * Created by max on 2019-04-08
 */
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
