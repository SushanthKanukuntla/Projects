package com.gfs.external.item;

import java.util.Date;

public interface ItemQuery {

	/**
	 * Find item by item id.  Currently only finds items beginning with 1, 2 or 3. Each item has a cost.
	 * @param id
	 * @param requestDate
	 * @return
	 * @throws ItemNotFoundException
	 */
	public Item findItem(String id, Date requestDate)
			throws ItemNotFoundException;

}