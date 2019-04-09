package springboot.petclinic.model;

import java.util.Set;

/**
 * Created by max on 2019-02-25
 */
public class Vet extends Person {

    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
