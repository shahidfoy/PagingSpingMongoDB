package com.mongodb.data.paging.controllers;

import java.util.Optional;
import com.mongodb.data.paging.models.Country;
import com.mongodb.data.paging.repositories.CountryRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {

	private CountryRepository countryRepository;

	public CountryController(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@GetMapping("/")
	public String showPage(Model model, @RequestParam(defaultValue="0") int page) {
		model.addAttribute("data", countryRepository.findAll(PageRequest.of(page, 4)));
		model.addAttribute("currentPage", page);
		return "index";
	}

	@PostMapping("/save")
	public String save(Country country) {
		countryRepository.save(country);

		return "redirect:/";
	}

	@GetMapping("/delete")
	public String deleteCountry(String id) {
		countryRepository.deleteById(id);

		return "redirect:/";
	}

	@GetMapping("/findOne")
	@ResponseBody
	public Country findOne(String id) {
		Optional<Country> countryOptional = countryRepository.findById(id);
		if(!countryOptional.isPresent()) {
			throw new RuntimeException("Country not found");
		}
		return countryOptional.get();
	}

}
