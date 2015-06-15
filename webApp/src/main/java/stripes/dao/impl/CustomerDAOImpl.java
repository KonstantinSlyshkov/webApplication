package stripes.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import stripes.dao.CustomerDAO;
import stripes.model.Customer;

import java.util.List;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */
@Repository
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory sessionFactory;

	public Customer getCustomerById(long id) {
		String hql = "from Customer e where e.customerId = :id";
		return (Customer) sessionFactory.getCurrentSession().createQuery(hql).setLong("id", id).uniqueResult();
	}

	public List<Customer> getAllCustomers() {
		String hql = "from Customer";
		return sessionFactory.getCurrentSession().createQuery(hql).list();
	}

	public void addCustomer(Customer customer) {
		Customer extracted = getCustomerById(customer.getCustomerId());
		if (!extracted.equals(customer)) {
			sessionFactory.getCurrentSession().save(customer);
		} else {
			throw new IllegalArgumentException("cannot add already existed customer");
		}
	}

	public void removeCustomerById(Customer customer) {
		Customer extracted = getCustomerById(customer.getCustomerId());
		sessionFactory.getCurrentSession().delete(customer);
	}
}
