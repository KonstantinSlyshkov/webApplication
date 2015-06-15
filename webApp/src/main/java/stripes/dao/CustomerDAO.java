package stripes.dao;

import stripes.model.Customer;

import java.util.List;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */
public interface CustomerDAO {

	Customer getCustomerById(long id);

	List<Customer> getAllCustomers();

	void addCustomer(Customer customer);

	void removeCustomerById(Customer customer);
}
