package com.gfs.price;

@SuppressWarnings("serial")
public class PriceServiceException extends Exception {

	public PriceServiceException() {
	}

	public PriceServiceException(String message) {
		super(message);
	}

	public PriceServiceException(Throwable cause) {
		super(cause);
	}

	public PriceServiceException(String message, Throwable cause) {
		super(message, cause);
	}

}
