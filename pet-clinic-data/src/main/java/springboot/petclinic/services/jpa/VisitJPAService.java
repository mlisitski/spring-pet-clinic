package springboot.petclinic.services.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import springboot.petclinic.model.Visit;
import springboot.petclinic.repositories.VisitRepository;
import springboot.petclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by max on 2019-04-16
 */
@Service
@Profile("jpa")
public class VisitJPAService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {
        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);

    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);

    }
}
