package com.core.utils;

import static com.core.utils.StringUtils.getSdf;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import com.core.pojo.Customer;

public class CustomerUtils {
	
	public static Customer[] getCustomerArray() {
		try {
			return new Customer[] {
				new Customer("David Darwin", "davin.darwin@gmail.com", "david@123", getSdf().parse("21/01/1988"), 11200),
				new Customer("Sean Bean", "bean1992@yahoo.co.in", "Sean@1234", getSdf().parse("06/08/1990"), 14590),
				new Customer("Sir Paul McKellen", "paul.mckellen@hotmail.com", "paul@1234", getSdf().parse("31/05/1987"), 9210),
				new Customer("Mrs Alice Smith", "iamalice@rediff.com", "Alice@1234", getSdf().parse("17/10/1984"), 11090),
				new Customer("A R Beevers", "mr.beevers@yahoo.in", "AR1234", getSdf().parse("09/09/1989"), 17590),
				new Customer("test", "test@gmail", "123456", getSdf().parse("09/09/1999"), 15000)
			};
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//return map
	public static ArrayList<String> getFormattedCustomerList(ArrayList<Customer> customerList){
		ArrayList<String> outputList = new ArrayList<String>(customerList.size());
		for(Customer c : customerList) {
			outputList.add(new String(c.getEmail() + "(" + getSdf().format(c.getBdate()) + ")"));
		}
		System.out.println("===========================\n"
				+ "Current List: " + outputList
				+ "\n===========================\n");
		return outputList;
	}
	
	public static HashMap<String, Customer> getPopulatedCustomerMap(HashMap<String, Customer> customerMap){
		if(customerMap == null)
			customerMap = new HashMap<String, Customer>();
		for(Customer customer : getCustomerArray()) {
			customerMap.put(customer.getEmail(), customer);
		}
		return customerMap;
	}
}
