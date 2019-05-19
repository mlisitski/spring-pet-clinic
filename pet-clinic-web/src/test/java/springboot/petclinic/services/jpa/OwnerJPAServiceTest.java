package springboot.petclinic.services.jpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import springboot.petclinic.model.Owner;
import springboot.petclinic.repositories.OwnerRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by max on 2019-04-27
 */
@ExtendWith(MockitoExtension.class)
class OwnerJPAServiceTest {

    public static final String LAST_NAME = "Smith";
    Owner returnOwner;

    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerJPAService ownerJPAService;

    @BeforeEach
    void setUp() {
        returnOwner = new Owner();
        returnOwner.setId(1l);
        returnOwner.setLastName(LAST_NAME);
    }

    @Test
    void findByLastName() {

        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);
        Owner smith = ownerJPAService.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, smith.getLastName());
        //redundant, to show Mockito
        verify(ownerRepository).findByLastName(any());
    }

    //todo debug test fail
//    @Test
//    void findAll() {
//        Set<Owner> returnOwnersSet = new HashSet<>();
//        returnOwnersSet.add(Owner.builder().id(1l).city("M").build());
//        returnOwnersSet.add(Owner.builder().id(2l).city("V").build());
//
//        when(ownerRepository.findAll()).thenReturn(returnOwnersSet);
//
//        Set<Owner> owners = ownerJPAService.findAll();
//
//        assertNotNull(owners);
//        assertEquals(2, owners.size());
//    }


    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnOwner));
        Owner owner = ownerJPAService.findById(1l);

        assertNotNull(owner);
    }

    @Test
    void save() {

        Owner ownerToSave = new Owner();
        ownerToSave.setId(1L);

        when(ownerRepository.save(any())).thenReturn(returnOwner);

        Owner savedOwner = ownerJPAService.save(ownerToSave);

        assertNotNull(savedOwner);

        verify(ownerRepository).save(any());

    }

    @Test
    void delete() {
        ownerJPAService.delete(returnOwner);
        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        ownerJPAService.deleteById(1L);

        verify(ownerRepository).deleteById(anyLong());

    }
}