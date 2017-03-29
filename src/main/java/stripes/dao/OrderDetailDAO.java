package stripes.dao;

import stripes.model.OrderDetail;

/**
 * (c) Swissquote 6/11/15
 *
 * @author kslyshkov
 */
public interface OrderDetailDAO {

	OrderDetail getOrderDetailByOrderId(long id);

	void addNewOrderDetail(OrderDetail orderDetail);

	void removeOrderDetailById(long id);
}
