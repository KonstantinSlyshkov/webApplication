package stripes.controller;

import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.integration.spring.SpringBean;
import stripes.model.Order;
import stripes.service.OrderService;

import java.util.List;

/**
 * (c) Swissquote 6/10/15
 *
 * @author kslyshkov
 */
public class OrdersAction implements ActionBean {

	private final String DEFAULT_PATH = "/WEB-INF/jsp/index.jsp";

	private ActionBeanContext context;

	@SpringBean
	private OrderService orderService;

	private List<Order> orders;

	@DefaultHandler
	public Resolution view() {
		orders = orderService.getAllOrders();

		return new ForwardResolution(DEFAULT_PATH);
	}


	public ActionBeanContext getContext() { return context; }

	public void setContext(ActionBeanContext context) { this.context = context; }

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
