package stripes.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import stripes.dao.OrderDetailDAO;
import stripes.model.OrderDetail;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */
@Repository
@Transactional(isolation = Isolation.REPEATABLE_READ, propagation = Propagation.MANDATORY)
public class OrderDetailDAOImpl implements OrderDetailDAO {

	@Autowired
	SessionFactory sessionFactory;

	public OrderDetail getOrderDetailByOrderId(long id) {
		String hql = "from OrderDetail od where od.order.orderId =:id";
		return (OrderDetail) sessionFactory.getCurrentSession().createQuery(hql).setLong("id",id).uniqueResult();
	}

	public void addNewOrderDetail(OrderDetail orderDetail) {
		OrderDetail extracted = getOrderDetailByOrderId(orderDetail.getOrder().getOrderId());
		if (!extracted.equals(orderDetail)) {
			sessionFactory.getCurrentSession().save(orderDetail);
		} else {
			throw new IllegalArgumentException("cannot save already existed orderDetails");
		}
	}

	public void removeOrderDetailById(long id) {
		OrderDetail orderDetail = getOrderDetailByOrderId(id);
		sessionFactory.getCurrentSession().delete(orderDetail);
	}
}
