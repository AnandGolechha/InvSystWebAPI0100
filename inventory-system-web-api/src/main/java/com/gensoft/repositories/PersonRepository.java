/**
 * 
 */
package com.gensoft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gensoft.model.Person;

/**
 * Person's repository.
 * <p>	
 * 
 * @author Anand Golechha
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
