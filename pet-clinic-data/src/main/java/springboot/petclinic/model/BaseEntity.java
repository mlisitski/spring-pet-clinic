package springboot.petclinic.model;

import java.io.Serializable;

/**
 * Created by max on 2019-03-07
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}