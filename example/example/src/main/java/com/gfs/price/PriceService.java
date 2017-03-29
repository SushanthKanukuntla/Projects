package com.gfs.price;

import java.math.BigDecimal;
import java.util.Date;

import com.gfs.external.customer.CustomerNotFoundException;
import com.gfs.external.customer.CustomerQuery;
import com.gfs.external.item.ItemQuery;

public class PriceService {

	// external collaborator for retrieving customer objects
	private CustomerQuery customerQuery;

	// external collaborator for retrieving item objects
	private ItemQuery itemQuery;

	/**
	 * Calculate a price for a customer and item for a particular date. Each
	 * customer has a credit status, and each item has a cost. A customer with
	 * high credit status gets a 10% discount from the item cost. A customer
	 * with medium credit status gets 5% discount from the item cost. A customer
	 * with low credit status cannot be priced.
	 * 
	 * @param customerId
	 *            nine digit customer id
	 * @param itemId
	 *            6 digit item id
	 * @param requestDate
	 *            required for effectivity customer and item queries
	 * @return a BigDecimal with scale of 2 rounded half up
	 * @throws IllegalArgumentException
	 *             if customerId or itemId is null or empty or if requestDate is
	 *             null
	 * @throws PriceServiceException
	 *             if customer does not exist or if item does not exist, or if
	 *             the customer has low credit status
	 */
	public BigDecimal calculatePrice(String customerId, String itemId, Date requestDate) throws PriceServiceException {

		if (requestDate == null) {
			throw new IllegalArgumentException("Request Date is null");
		} else if (customerId == null) {
			throw new IllegalArgumentException("Customer Id is null");
		} else if (itemId == null) {
			throw new IllegalArgumentException("Item Id is null");
		}
		try {
			customerQuery.findCustomer(customerId, requestDate);
		} catch (CustomerNotFoundException e) {
			throw new PriceServiceException();
		}
		return new BigDecimal(0);
	}

	public void setCustomerQuery(CustomerQuery customerQuery) {
		this.customerQuery = customerQuery;
	}

	public void setItemQuery(ItemQuery itemQuery) {
		this.itemQuery = itemQuery;
	}
}
