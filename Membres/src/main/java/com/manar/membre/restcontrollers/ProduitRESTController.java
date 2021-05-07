package com.manar.membre.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manar.membre.entities.Membre;
import com.manar.membre.service.MembreService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {
@Autowired
MembreService membreService;
@RequestMapping(method = RequestMethod.GET)
public List<Membre> getAllMembres() {
return membreService.getAllMembres();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Membre getMembreById(@PathVariable("id") Long id) {
return membreService.getMembre(id);
 }
@RequestMapping(method = RequestMethod.POST)
public Membre createMembre(@RequestBody Membre membre) {
return membreService.saveMembre(membre);
}
@RequestMapping(method = RequestMethod.PUT)
public Membre updateMembre(@RequestBody Membre produit) {
return membreService.updateMembre(produit);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteMembre(@PathVariable("id") Long id)
{
	membreService.deleteMembreById(id);
}

}
