package stripes.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

/**
 * (c) Swissquote 6/10/15
 *
 * @author kslyshkov
 */
@Entity
@Table(name = "EMPLOYEES")
@Cacheable
@Cache(region = "employee", usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Employee {

	@Id
	@Column(name = "EMPLOYEE_ID")
	private long id;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "BIRTH_DATE")
	@Type(type = "date")
	private Date birthDate;

	@Column(name = "HIRE_DATE")
	@Type(type = "date")
	private Date hireDate;

	@Column(name = "ADRESS")
	private String address;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Employee employee = (Employee) o;

		if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
		if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
		if (title != null ? !title.equals(employee.title) : employee.title != null) return false;
		if (birthDate != null ? !birthDate.equals(employee.birthDate) : employee.birthDate != null) return false;
		if (hireDate != null ? !hireDate.equals(employee.hireDate) : employee.hireDate != null) return false;
		return !(address != null ? !address.equals(employee.address) : employee.address != null);

	}

	@Override
	public int hashCode() {
		int result = lastName != null ? lastName.hashCode() : 0;
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
		result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		return result;
	}
}
