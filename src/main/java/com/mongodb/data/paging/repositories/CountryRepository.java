package com.mongodb.data.paging.repositories;

import com.mongodb.data.paging.models.Country;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryRepository extends MongoRepository<Country, String> {

}
