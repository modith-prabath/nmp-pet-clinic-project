package nmp.springframework.nmppetclinicproject.services;

import java.util.Set;

import nmp.springframework.nmppetclinicproject.model.Owner;

public interface OwnerService {

  Owner findByLastName(String lastName);

  Owner findById(Long id);

  Owner save(Owner owner) ;

  Set<Owner> findAll();

  
}
