package com.gfs.external.customer;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends Exception {

	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(String arg0) {
		super(arg0);
	}

	public CustomerNotFoundException(Throwable arg0) {
		super(arg0);
	}

	public CustomerNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
