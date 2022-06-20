package nmp.springframework.nmppetclinicproject.services;

import java.util.Set;

import nmp.springframework.nmppetclinicproject.model.Vet;

public interface VetService {

  Vet findById(Long id);

  Vet save(Vet vet) ;

  Set<Vet> findAll();
  
}