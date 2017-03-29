package com.gfs.external.item;

import java.math.BigDecimal;
import java.util.Date;

public class DefaultItemQuery implements ItemQuery {

	/* (non-Javadoc)
	 * @see com.gfs.external.item.ItemQuery#findItem(java.lang.String, java.util.Date)
	 */
	public Item findItem(String id, Date requestDate) throws ItemNotFoundException {
		
		if(id == null) {
			throw new IllegalArgumentException("item id cannot be null");
		}

		if(id.length() != 6) {
			throw new IllegalArgumentException("item id must be 6 digits long");
		}

		if(id.startsWith("1")) {
			
			Item item = new Item();
			item.setId(id);
			item.setName("item1");
			item.setCost(new BigDecimal("5.50"));
			return item;
			
		} else if(id.startsWith("2")) {
			
			Item item = new Item();
			item.setId(id);
			item.setName("item2");
			item.setCost(new BigDecimal("7.50"));
			return item;
			
		} else if(id.startsWith("3")) {
			
			Item item = new Item();
			item.setId(id);
			item.setName("item3");
			item.setCost(new BigDecimal("9.50"));
			return item;
			
		} else {
			
			throw new ItemNotFoundException("item not found: "+id);
		}
	}
}
