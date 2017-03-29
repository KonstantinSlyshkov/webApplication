package stripes.dao;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import stripes.forTesting.DaoSupport;
import stripes.forTesting.DataBaseTest;
import stripes.model.Employee;

import java.util.List;

import static org.junit.Assert.*;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class TestEmployeeDAO extends DataBaseTest {

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	EmployeeDAO employeeDAO;

	@Before
	public void setUp() throws Exception {
		setDaoSupport(new DaoSupport(sessionFactory));
		cleanDb();
		getDaoSupport().save(createEmployee());
		getDaoSupport().flushAndClear();
	}


	@Test
	public void testGetAllEmployees() throws Exception {
		List list = employeeDAO.getAllEmployees();
		assertEquals(1,list.size());
	}

	@Test
	public void testRemoveEmployeeById() throws Exception {
		employeeDAO.removeEmployeeById(1);
		assertNull(employeeDAO.getEmployeeById(1));
	}

	private Employee createEmployee() {
		Employee employee = new Employee();
		employee.setFirstName("first");
		employee.setLastName("last");
		employee.setAddress("somewhere");
		employee.setTitle("manager");
		employee.setId(1);
		return employee;
	}

	@Override
	public Class[] getClassesToDelete() {
		return new Class[] {
				Employee.class
		};
	}
}