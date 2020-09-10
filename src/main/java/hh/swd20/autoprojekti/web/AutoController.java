package hh.swd20.autoprojekti.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import hh.swd20.autoprojekti.domain.Auto;

@Controller
public class AutoController {

	// palauttaa autolistaukset
	@RequestMapping(value = "/cars", method = RequestMethod.GET)
	public String getAutot(Model model) {
		// ei haeta vielä tietokannasta autoja
		List<Auto> autot = new ArrayList<Auto>();// luodaan tyjä lista
		autot.add(new Auto("Tesla", 2016));
		autot.add(new Auto("Saab", 1986));
		System.out.println(autot);
		// lisätään autolista model-olion mappiin avainarvolla templatea varten
		model.addAttribute("autot", autot); // 1. "keyword" for map, 2. dataobject

		return "autolista"; // palautetaan autolista.html-templaten nimi DispatcherServletille
	}

}
