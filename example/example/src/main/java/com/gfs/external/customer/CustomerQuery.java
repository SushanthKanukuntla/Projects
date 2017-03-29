package com.gfs.external.customer;

import java.util.Date;

public interface CustomerQuery {

	/**
	 * Find customer by customer id.  Returns customer objects for customerId starting with "1", "2" or "3".
	 * Each customer has a credit status. Customers with id that begin with 1 have HIGH credit status, 
	 * id beginning with 2 has MEDIUM, 3 has LOW credit status 
	 * @param id a String that must be 9 digits long
	 * @param requestDate effectivity date
	 * @return Customer object containing name, id and creditStatus
	 * @throws CustomerNotFoundException
	 */
	public abstract Customer findCustomer(String id, Date requestDate)
			throws CustomerNotFoundException;

}