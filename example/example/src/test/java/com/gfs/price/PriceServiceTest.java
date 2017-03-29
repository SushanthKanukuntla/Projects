package com.gfs.price;

import static org.easymock.EasyMock.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.gfs.external.customer.Customer;
import com.gfs.external.customer.CustomerNotFoundException;
import com.gfs.external.customer.CustomerQuery;

public class PriceServiceTest {

	private PriceService priceService;
	private CustomerQuery customerQuery;

	@Before
	public void setUp() throws Exception {
		priceService = new PriceService();
		customerQuery = mock(CustomerQuery.class);
		priceService.setCustomerQuery(customerQuery);
	}

	@Test(expected = IllegalArgumentException.class)
	public void calculatePriceTestRequestDateNull() throws PriceServiceException {
		priceService.calculatePrice("CustID", "ItemId", null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void calculatePriceTestCustIdNull() throws PriceServiceException {
		priceService.calculatePrice(null, "ItemId", new Date());
	}

	@Test(expected = IllegalArgumentException.class)
	public void calculatePriceTestItemIdNull() throws PriceServiceException {
		priceService.calculatePrice("CustID", null, new Date());
	}

	@Test(expected = IllegalArgumentException.class)
	public void calculatePriceTestCustNotExists() throws PriceServiceException, CustomerNotFoundException {
		String custId = "CustID";
		Date date = new Date();
		expect(customerQuery.findCustomer(custId, date)).andThrow(new CustomerNotFoundException());
		replay(customerQuery);
		priceService.calculatePrice(custId, "itemId", date);
		verify(customerQuery);
	}

}
