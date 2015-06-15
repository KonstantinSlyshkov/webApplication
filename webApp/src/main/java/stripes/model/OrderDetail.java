package stripes.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * (c) Swissquote 6/10/15
 *
 * @author kslyshkov
 */
@Entity
@Table(name = "ORDER_DETAILS")
public class OrderDetail implements Serializable {

	private static final long serialVersionUID = -3735L;

	@Id
	@OneToOne(cascade = CascadeType.ALL)
	private Order order;

	@Column(name = "COMMODITY")
	private String commodity;

	@Column(name = "RETAIL_PRICE")
	private double retailPrice;

	@Column(name = "QUANTITY")
	private int quantity;

	@Column(name = "DISCOUNT")
	private String discount;

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getCommodity() {
		return commodity;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		OrderDetail that = (OrderDetail) o;

		if (Double.compare(that.retailPrice, retailPrice) != 0) return false;
		if (quantity != that.quantity) return false;
		if (order != null ? !order.equals(that.order) : that.order != null) return false;
		if (commodity != null ? !commodity.equals(that.commodity) : that.commodity != null) return false;
		return !(discount != null ? !discount.equals(that.discount) : that.discount != null);

	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = order != null ? order.hashCode() : 0;
		result = 31 * result + (commodity != null ? commodity.hashCode() : 0);
		temp = Double.doubleToLongBits(retailPrice);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + quantity;
		result = 31 * result + (discount != null ? discount.hashCode() : 0);
		return result;
	}
}
