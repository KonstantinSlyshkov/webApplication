package stripes.dao;

import stripes.model.Employee;

import java.util.List;

/**
 * (c) Swissquote 6/10/15
 *
 * @author kslyshkov
 */

public interface EmployeeDAO {

	Employee getEmployeeById(long id);

	List<Employee> getAllEmployees();

	void removeEmployeeById(long id);
}
