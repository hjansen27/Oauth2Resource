package bernd.repository;

import org.springframework.data.repository.CrudRepository;

import bernd.model.Country;

// This will be AUTO IMPLEMENTED by Spring into a Bean called countryRepository
// CRUD refers Create, Read, Update, Delete

public interface CountryRepository extends CrudRepository<Country, Integer> {

}
