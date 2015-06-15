package stripes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import stripes.dao.OrderDAO;
import stripes.model.Order;
import stripes.service.OrderService;

import java.util.List;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */
@Service
@Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;

	public Order getOrderById(long id) {
		return orderDAO.getOrderById(id);
	}

	public List<Order> getAllOrders() {
		return orderDAO.getAllOrders();
	}

	public void addNewOrders(Order order) {
		orderDAO.addNewOrders(order);
	}

	public void removeOrderById(long id) {
		orderDAO.removeOrderById(id);
	}

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}
}
