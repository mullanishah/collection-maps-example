package com.core.tester;

import static com.core.utils.StringUtils.getSdf;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;
import com.core.exceptions.OnlineShoppingException;
import com.core.pojo.Customer;

public class RegisterCustomer {

	public static void register(HashMap<String, Customer> customerMap, Scanner scanner) throws ParseException, OnlineShoppingException {
		System.out.println("Enter details (email, name, pwd, b'date(dd/MM/yyyy), reg.amount): ");
		if(scanner.hasNext()) {
			String mail = scanner.next();
			if(customerMap.containsKey(mail)) {
				throw new OnlineShoppingException("Email already exist!!");
			} else {
				Customer c = new Customer(scanner.next(), mail, scanner.next(), getSdf().parse(scanner.next()), scanner.nextDouble());
				customerMap.put(mail, c);
				System.out.println("New customer registered successfully!!");
			}
		} else {
			throw new OnlineShoppingException("Invalid email id!!");
		}
		
	}
	
	public static void unsubscribe(HashMap<String, Customer> customerMap, Scanner scanner) throws Exception {
		System.out.println("Enter email id: ");
		String mail = scanner.next();
		if(customerMap.containsKey(mail)) {
			Customer removedCustomer = customerMap.remove(mail);
			System.out.println("Customer details removed successfully!!, details: " + removedCustomer);
		} else {
			throw new OnlineShoppingException("Email id not found !");
		}
	}

}
