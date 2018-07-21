package com.mongodb.data.paging;

import com.mongodb.data.paging.models.Country;
import com.mongodb.data.paging.repositories.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PagingApplication implements CommandLineRunner {

	private CountryRepository countryRepository;

	public PagingApplication(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PagingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		countryRepository.deleteAll();

		countryRepository.save(new Country("Earth", "World"));
		countryRepository.save(new Country("USA", "Washington DC"));
		countryRepository.save(new Country("China", "Peking"));
		countryRepository.save(new Country("Singapore", "Singapore"));
		countryRepository.save(new Country("Germany", "Berlin"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Namibia", "Windhoek"));
		countryRepository.save(new Country("India", "New Delhi"));
		countryRepository.save(new Country("Kenya", "Nairobi"));
		countryRepository.save(new Country("Canada", "Ottawa"));
		countryRepository.save(new Country("Brazil", "Brazilia"));
		countryRepository.save(new Country("Egypt", "Cairo"));
		countryRepository.save(new Country("Nigeria", "Abuja"));
		countryRepository.save(new Country("Afghanistan", "Kabul"));
		countryRepository.save(new Country("Italy", "Rome"));
		countryRepository.save(new Country("Malaysia", "Kuala Lumpur"));
		countryRepository.save(new Country("Mexico", "Mexico City"));

	}
}
