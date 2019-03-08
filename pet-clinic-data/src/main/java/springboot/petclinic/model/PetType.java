package springboot.petclinic.model;

/**
 * Created by max on 2019-02-25
 */
public class PetType extends BaseEntity{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
