package stripes.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import stripes.dao.OrderDAO;
import stripes.model.Order;

import java.util.List;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */
@Repository
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	SessionFactory sessionFactory;

	public Order getOrderById(long id) {
		String hql = "from Order e where e.orderId = :id";
		return (Order) sessionFactory.getCurrentSession().createQuery(hql).setLong("id", id).uniqueResult();
	}

	public List<Order>  getAllOrders() {
		String hql = "from Order";
		return sessionFactory.getCurrentSession().createQuery(hql).list();
	}

	public void addNewOrders(Order order) {
			sessionFactory.getCurrentSession().saveOrUpdate(order);
	}

	public void removeOrderById(long id) {
		Order order = getOrderById(id);
		sessionFactory.getCurrentSession().delete(order);
	}
}
