package stripes.service;

import stripes.model.Order;

import java.util.List;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */

public interface OrderService {

	Order getOrderById(long id);

	List<Order> getAllOrders();

	void addNewOrders(Order order);

	void removeOrderById(long id);
}
