package springboot.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by max on 2019-02-25
 */
public class Vet extends Person {

    private Set<Speciality> specialties = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialties;
    }

    public void setSpecialties(Set<Speciality> specialties) {
        this.specialties = specialties;
    }
}
