package stripes.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * (c) Swissquote 6/10/15
 *
 * @author kslyshkov
 */
@Entity
@Table(name = "ORDERS")
public class Order implements Serializable {

	private static final long serialVersionUID = -2520L;
	@Id
	@Column(name = "ORDER_ID")
	private long orderId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMPLOYEE_ID")
	private Employee employee;

	@Type(type = "date")
	@Column(name = "ORDER_DATE")
	private Date orderDate;

	@Type(type = "date")
	@Column(name = "SHIPPED_DATE")
	private Date shippedDate;

	@Column(name = "SHIP_ADRESS")
	private String shipAddress;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Order order = (Order) o;

		if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
		if (employee != null ? !employee.equals(order.employee) : order.employee != null) return false;
		if (orderDate != null ? !orderDate.equals(order.orderDate) : order.orderDate != null) return false;
		if (shippedDate != null ? !shippedDate.equals(order.shippedDate) : order.shippedDate != null) return false;
		return !(shipAddress != null ? !shipAddress.equals(order.shipAddress) : order.shipAddress != null);

	}

	@Override
	public int hashCode() {
		int result = customer != null ? customer.hashCode() : 0;
		result = 31 * result + (employee != null ? employee.hashCode() : 0);
		result = 31 * result + (orderDate != null ? orderDate.hashCode() : 0);
		result = 31 * result + (shippedDate != null ? shippedDate.hashCode() : 0);
		result = 31 * result + (shipAddress != null ? shipAddress.hashCode() : 0);
		return result;
	}
}
