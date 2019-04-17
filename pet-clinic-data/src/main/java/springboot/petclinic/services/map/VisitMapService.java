package springboot.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springboot.petclinic.model.Visit;
import springboot.petclinic.services.VisitService;

import java.util.Set;

/**
 * Created by max on 2019-04-16
 */
@Service
@Profile({"default", "map"})

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public Visit save(Visit visit) {


        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null || visit
                .getPet().getOwner().getId() == null) {
            {
                throw new RuntimeException("Invalid visit");
            }
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long aLong) {
        return super.findById(aLong);
    }
}
