package bernd.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bernd.model.Country;
import bernd.repository.CountryRepository;

@RestController
//@RequestMapping("/secured")
public class SecuredController {

	@Autowired
	CountryRepository countryRepo;
	
	@RequestMapping("/secured")
	@GetMapping
	public String securedResource(Authentication auth) {
		return "This is a SECURED resource. Authentication: " + auth.getName() + "; Authorities: " + auth.getAuthorities();
	}
	
	@RequestMapping("/test")
	@GetMapping
	public List<Country> country(Authentication auth) {
				
		return StreamSupport.stream(countryRepo.findAll().spliterator(), false)
				    .collect(Collectors.toList());
		
	}
	
	@RequestMapping("/user")
	@PostMapping
	public String user(Authentication auth) {
				
		
		
		return "";
	}
	
}

