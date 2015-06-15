package stripes.model;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

/**
 * (c) Swissquote 6/10/15
 *
 * @author kslyshkov
 */
@Entity
@Table(name = "CUSTOMERS")
@Cacheable
@Cache(region = "customer", usage = CacheConcurrencyStrategy.READ_WRITE)
public class Customer {

	@Id
	@Column(name = "CUSTOMER_ID", nullable = false)
	private long customerId;

	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "CONTACT_NAME")
	private String contactName;

	@Column(name = "CONTACT_TITLE")
	private String contactTitle;

	@Column(name = "ADDRESS")
	private String address;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Customer customer = (Customer) o;

		if (customerId != customer.customerId) return false;
		if (companyName != null ? !companyName.equals(customer.companyName) : customer.companyName != null)
			return false;
		if (contactName != null ? !contactName.equals(customer.contactName) : customer.contactName != null)
			return false;
		if (contactTitle != null ? !contactTitle.equals(customer.contactTitle) : customer.contactTitle != null)
			return false;
		return !(address != null ? !address.equals(customer.address) : customer.address != null);

	}

	@Override
	public int hashCode() {
		int result = (int) (customerId ^ (customerId >>> 32));
		result = 31 * result + (companyName != null ? companyName.hashCode() : 0);
		result = 31 * result + (contactName != null ? contactName.hashCode() : 0);
		result = 31 * result + (contactTitle != null ? contactTitle.hashCode() : 0);
		result = 31 * result + (address != null ? address.hashCode() : 0);
		return result;
	}
}
