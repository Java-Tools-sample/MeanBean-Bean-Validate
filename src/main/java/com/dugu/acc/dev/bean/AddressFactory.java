package com.dugu.acc.dev.bean;

import org.meanbean.lang.Factory;

public class AddressFactory implements Factory<String[]> {

	public String[] create() {
		return new String[] { "Bangalore", "Marathali", "560037" };
	}

}
