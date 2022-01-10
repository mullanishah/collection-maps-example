package com.core.tester;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import com.core.exceptions.OnlineShoppingException;
import com.core.pojo.Customer;
import com.core.utils.StringUtils;

public class DisplayCustomerDetails {

	public static void displayCustomers(HashMap<String, Customer> customerMap) throws OnlineShoppingException {
		
		if(null == customerMap) {
			throw new OnlineShoppingException("Customer details not found");
		} else {
			Collection<Customer> customers = customerMap.values();
			Iterator<Customer> iterator = customers.iterator();
			StringUtils.printLine();
			while(iterator.hasNext()) {
				Customer c = iterator.next();
				System.out.println(c.getFullName() + "[" + c.getEmail() 
							+ ", B'Date:" + StringUtils.getSdf().format(c.getBdate()) + ", Reg.Amount: Rs." + c.getRegAmount() + "]");
			}
		}
	}
}
