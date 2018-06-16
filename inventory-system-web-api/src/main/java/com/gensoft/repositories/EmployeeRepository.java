/**
 * 
 */
package com.gensoft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gensoft.model.Employee;

/**
 * Employee repository.
 * <p>
 * 
 * @author Anand Golechha
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}
