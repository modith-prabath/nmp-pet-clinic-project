package nmp.springframework.nmppetclinicproject.services;


import nmp.springframework.nmppetclinicproject.model.Owner;

public interface OwnerService extends CrudService<Owner , Long> {

  Owner findByLastName(String lastName);
  
}
