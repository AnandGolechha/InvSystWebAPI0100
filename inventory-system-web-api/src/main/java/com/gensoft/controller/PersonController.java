/**
 * 
 */
package com.gensoft.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gensoft.exception.ResourceNotFoundException;
import com.gensoft.model.Person;
import com.gensoft.repositories.PersonRepository;

/**
 * Controller class for Person.
 * <p>
 * 
 * @author Anand Golechha
 *
 */
@RestController
@RequestMapping(path = "/person-api")
public class PersonController {

	@Autowired
	PersonRepository personRepository;

	/**
	 * This will return all person exist in system.
	 * 
	 * @return {@link List} - of persons.
	 */
	@GetMapping("/persons")
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	/**
	 * This will create a person in system.
	 * 
	 * @param person
	 *            - to be created.
	 * @return {@link Person}
	 */
	@PostMapping
	public Person createPerson(@Valid @RequestBody Person person) {
		return personRepository.save(person);
	}

	/**
	 * This will return person by his id if exist else throw
	 * {@link ResourceNotFoundException}.
	 * 
	 * @param id
	 *            - person id.
	 * @return {@link Person}
	 */
	@GetMapping("/person/{id}")
	public Person getPersonById(@PathVariable(name = "id") Integer id) {
		return personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Person", "id", id));
	}

	/**
	 * 
	 * @param id
	 * @param person
	 * @return
	 */
	@PutMapping("/person/{id}")
	public Person updatePerson(@PathVariable("id") Integer id, @Valid @RequestBody Person person) {
		Person personToUpdate = personRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Person", "id", id));
		
		personToUpdate.setFirstName(person.getFirstName());
		personToUpdate.setMiddleName(person.getMiddleName());
		personToUpdate.setLastName(person.getLastName());
		personToUpdate.setCity(person.getCity());
		personToUpdate.setState(person.getState());
		personToUpdate.setCountry(person.getCountry());
		personToUpdate.setAddress(person.getAddress());
		personToUpdate.setAge(person.getAge());
		personToUpdate.setSex(person.getSex());
		personToUpdate.setEmailAddress(person.getEmailAddress());
		personToUpdate.setPhoneNumber(person.getPhoneNumber());
		personToUpdate.setBirthDate(person.getBirthDate());
		personToUpdate.setImagePath(person.getImagePath());
		
		return personRepository.save(personToUpdate);
	}
}
