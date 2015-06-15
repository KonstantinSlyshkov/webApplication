package stripes.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import stripes.dao.EmployeeDAO;
import stripes.model.Employee;

import java.util.List;

/**
 * (c) Swissquote 6/10/15
 *
 * @author kslyshkov
 */
@Repository
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	SessionFactory sessionFactory;

	public Employee getEmployeeById(long id) {
		String hql = "from Employee e where e.id = :id";
		return (Employee) sessionFactory.getCurrentSession().createQuery(hql).setLong("id", id).uniqueResult();
	}

	public List<Employee> getAllEmployees() {
		String hql = "from Employee";
		return sessionFactory.getCurrentSession().createQuery(hql).list();
	}

	public void removeEmployeeById(long id) {
		Employee employee = getEmployeeById(id);
		sessionFactory.getCurrentSession().delete(employee);
	}
}
