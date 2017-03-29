package stripes.dao;

import stripes.model.Order;

import java.util.List;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */
public interface OrderDAO {

	Order getOrderById(long id);

	List<Order> getAllOrders();

	void addNewOrders(Order order);

	void removeOrderById(long id);
}
