package com.manar.membre.controllers;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.manar.membre.entities.Membre;
import com.manar.membre.service.MembreService;
import com.sun.el.parser.ParseException;



	@Controller
    public class MembreController {
	@Autowired
	MembreService membreService;
	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap)
	{
	modelMap.addAttribute("membre", new Membre());
	return "formMembre";
	}
	@RequestMapping("/saveMembre")
	public String saveMembre(@Valid Membre membre,
	 BindingResult bindingResult)
	{
	if (bindingResult.hasErrors()) return "createMembre";

	membreService.saveMembre(membre);
	return "formMembre";
	}
	@RequestMapping("/ListeMembres")
	public String listeMembres(ModelMap modelMap)
	{
	List<Membre> mems = membreService.getAllMembres();
	modelMap.addAttribute("membres", mems);
	return "listeMembres";
	}
	@RequestMapping("/supprimerMembre")
	public String supprimerMembre(@RequestParam("id") Long id,ModelMap modelMap,
	@RequestParam (name="page",defaultValue = "0") int page,
	@RequestParam (name="size", defaultValue = "2") int size)
	{
	membreService.deleteMembreById(id);
	Page<Membre> mems = membreService.getAllMembresParPage(page,size);
	modelMap.addAttribute("membres", mems);
	modelMap.addAttribute("pages", new int[mems.getTotalPages()]);
	modelMap.addAttribute("currentPage", page);
	modelMap.addAttribute("size", size);
	return "listeMembres";
	}
	@RequestMapping("/modifierMembre")
	public String editerMembre(@RequestParam("id") Long id,ModelMap modelMap)
	{
	Membre m = membreService.getMembre(id);
	modelMap.addAttribute("membre", m);
	return "formMembre";
	}
	@RequestMapping("/updateProduit")
	public String updateProduit(@ModelAttribute("produit") Membre membre,
	@RequestParam("date") String date ,  ModelMap modelMap) throws ParseException, java.text.ParseException
	{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateInscription = dateformat.parse(String.valueOf(date));
	 membre.setDateInscription(dateInscription);

	 membreService.updateMembre(membre);
	 List<Membre> prods = membreService.getAllMembres();
	 modelMap.addAttribute("produits", prods);
	return "listeMembres";
	}

	}

