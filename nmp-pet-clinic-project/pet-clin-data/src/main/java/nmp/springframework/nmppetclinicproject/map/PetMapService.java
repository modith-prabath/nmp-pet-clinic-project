package nmp.springframework.nmppetclinicproject.map;

import java.util.Set;

import nmp.springframework.nmppetclinicproject.model.Pet;
import nmp.springframework.nmppetclinicproject.services.CrudService;

public class PetMapService  extends AbstractMapService<Pet , Long> implements CrudService<Pet , Long> {

  @Override
  public void delete(Pet object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public Pet findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Pet save(Pet object) {
    return super.save(object.getId(), object);
  }

  
 

  
  
}
