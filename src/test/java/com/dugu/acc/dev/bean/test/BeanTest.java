package com.dugu.acc.dev.bean.test;

import org.junit.Test;
import org.meanbean.test.BeanTester;
import org.meanbean.test.Configuration;
import org.meanbean.test.ConfigurationBuilder;
import org.meanbean.test.EqualsMethodTester;
import org.meanbean.test.HashCodeMethodTester;

import com.dugu.acc.dev.bean.AddressFactory;
import com.dugu.acc.dev.bean.Employee;
import com.dugu.acc.dev.bean.User;

/**
 * Unit test for simple App.
 */
public class BeanTest {
	@Test
	public void userBeanTest() {
		Configuration configuration = new ConfigurationBuilder()
				.overrideFactory("address", new AddressFactory()).build();
		new BeanTester().testBean(User.class, configuration);
		// Test For Equals Method
		new EqualsMethodTester().testEqualsMethod(User.class);
		// Test For Hashcode Method
		new HashCodeMethodTester().testHashCodeMethod(User.class);
	}

	@Test
	public void employeeTest() {
		new BeanTester().testBean(Employee.class);
		// Test For Equals Method
		new EqualsMethodTester().testEqualsMethod(Employee.class);
		// Test For Hashcode Method
		new HashCodeMethodTester().testHashCodeMethod(Employee.class);
	}
}
