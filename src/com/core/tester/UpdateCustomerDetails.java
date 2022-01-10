package com.core.tester;

import java.util.HashMap;
import java.util.Scanner;
import com.core.exceptions.OnlineShoppingException;
import com.core.pojo.Customer;

public class UpdateCustomerDetails {
	
	public static void updatePassword(HashMap<String, Customer> customerMap, Scanner scanner) throws Exception {
		System.out.println("Enter email id: ");
		String mail = scanner.next();
		if(!(customerMap.containsKey(mail)))
			throw new OnlineShoppingException("Email id not found !");
		else {
			Customer customer = customerMap.get(mail);
			System.out.println("Enter new password: ");
			String newPwd = scanner.next();
			boolean updateStatus = customer.setPassword(newPwd);
			System.out.println((updateStatus == true) ? "Customer details updated !" : "Details not updated. Please try again.");
			System.out.println("Customer details: " + customer);
		}
	}
	
	//update other fields

}
