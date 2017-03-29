package stripes.dao;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import stripes.forTesting.DaoSupport;
import stripes.forTesting.DataBaseTest;
import stripes.model.Customer;
import stripes.model.Employee;
import stripes.model.Order;

import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */
@ContextConfiguration("classpath:applicationContext.xml")
public class OrderDAOTest extends DataBaseTest {

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	OrderDAO orderDAO;

	@Before
	public void setUp() throws Exception {
		setDaoSupport(new DaoSupport(sessionFactory));
		cleanDb();
		Employee employee = new Employee();
		employee.setFirstName("first");
		employee.setLastName("last");
		employee.setAddress("somewhere");
		employee.setTitle("manager");
		employee.setId(1);
		Customer customer = new Customer();
		customer.setAddress("adrCus");
		customer.setCompanyName("COmp");
		customer.setContactName("contact");
		customer.setContactTitle("title");
		customer.setCustomerId(1);
		getDaoSupport().saveAll(employee, customer);

		Order order = new Order();
		order.setCustomer(customer);
		order.setEmployee(employee);
		order.setOrderDate(new Date());
		order.setShipAddress("shipAdress");
		order.setShippedDate(new Date());
		order.setVersion(13);
		getDaoSupport().save(order);
	}

	@Test
	public void testGetAllOrders() throws Exception {
		assertEquals(1,orderDAO.getAllOrders().size());
	}

	/*@Test
	public void testGetAllOrders() throws Exception {
		Order order = orderDAO.getOrderById(1);
		assertEquals(order.getShipAddress(),"shipAdress");
	}*/
	@Override
	public Class[] getClassesToDelete() {
		return new Class[] {
				Order.class,
				Employee.class,
				Customer.class
		};
	}
}