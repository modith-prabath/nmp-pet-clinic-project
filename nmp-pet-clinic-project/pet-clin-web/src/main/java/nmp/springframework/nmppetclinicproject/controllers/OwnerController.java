package nmp.springframework.nmppetclinicproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/owners")
@Controller
public class OwnerController {
  
  @RequestMapping({"","/", "/index" , "/index.html"})
  public String listsOwners(){

    return "owners/index" ;
  }

  //here mapping request implemented in a different way 
  // vet mapping and owner mapping is imlemeted in two different ways 
  //compare both to know difference in implementation 
}
