package springboot.petclinic.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by max on 2019-02-25
 */
public class Pet extends BaseEntity {


    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birthDate = LocalDate.parse(birthDate, dtf);
    }
}
