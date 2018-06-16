/**
 * 
 */
package com.gensoft.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Customer bean class.
 * <p>
 * 
 * @author Anand Golechha
 *
 */
@Entity
@Table(name = "customer")
@PrimaryKeyJoinColumn(name = "id")
public class Customer extends Person {

}
