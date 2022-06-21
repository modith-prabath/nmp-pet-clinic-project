package nmp.springframework.nmppetclinicproject.map;

import java.util.Set;

import nmp.springframework.nmppetclinicproject.model.Owner;
import nmp.springframework.nmppetclinicproject.services.CrudService;

public class OwnerMapService extends AbstractMapService<Owner , Long> implements CrudService<Owner , Long> {

  @Override
  public void delete(Owner object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Owner save(Owner object) {
    return super.save(object.getId(), object);
  }

  
 

  
  
}
