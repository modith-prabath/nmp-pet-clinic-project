package nmp.springframework.nmppetclinicproject.services;

import java.util.Set;

import nmp.springframework.nmppetclinicproject.model.Pet;

public interface PetService {

  Pet findById(Long id);

  Pet save(Pet pet) ;

  Set<Pet> findAll();
  
}
