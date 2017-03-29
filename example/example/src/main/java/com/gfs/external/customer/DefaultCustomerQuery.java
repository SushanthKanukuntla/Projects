package com.gfs.external.customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DefaultCustomerQuery implements CustomerQuery {

	/* (non-Javadoc)
	 * @see com.gfs.external.customer.CustomerQuery#findCustomer(java.lang.String, java.util.Date)
	 */
	public Customer findCustomer(String id, Date requestDate) throws CustomerNotFoundException {
		
		Integer a = new Integer(1);
		
		List<Integer> l = new ArrayList<Integer>();
		
		int m = 1;
		
		l.add(m);
		
		if(id == null) {
			throw new IllegalArgumentException("customer id cannot be null");
		}
		
		if(id.length() != 9) {
			throw new IllegalArgumentException("customer id must be 9 digits long");
		}
		
		if(id.startsWith("1")) {
			
			Customer customer = new Customer();
			customer.setName("Joe's Pizza");
			customer.setId(id);
			customer.setCreditStatus(CreditStatus.HIGH);
			return customer;
		
		} else if(id.startsWith("2")) {
			
			Customer customer = new Customer();
			customer.setName("Fred's Restaurant");
			customer.setId(id);
			customer.setCreditStatus(CreditStatus.MEDIUM);
			return customer;

		} else if(id.startsWith("3")) {
			
			Customer customer = new Customer();
			customer.setName("John's Grill");
			customer.setId(id);
			customer.setCreditStatus(CreditStatus.LOW);
			return customer;
			
		} else {
			throw new CustomerNotFoundException("customer not found: "+id);
		}
	}
}
