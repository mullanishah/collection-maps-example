package com.core.tester;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Scanner;
import com.core.pojo.Customer;
import com.core.utils.CustomerUtils;
import com.core.utils.StringUtils;

public class MainTester {
	
	private static HashMap<String, Customer> customerMap;
	private static Scanner scanner;
	
	static {
		scanner = StringUtils.getScanner();
		customerMap = CustomerUtils.getPopulatedCustomerMap(customerMap);
	}

	public static void main(String[] args) {
		int choice = 0;
		try {
			do {
				StringUtils.printLine();
				System.out.println("### MENU ###");
				System.out.println("1.Register new customer \n2.Unsubscibe existing \n3.Update password \n4.Display details "
						+ "\n5.Sort(On Email) \n6.Sort(on DoB) \n7.Exit");
				System.out.println("Enter your choice: ");
				choice = scanner.nextInt();
				switch(choice) {
				case 1: 
					RegisterCustomer.register(customerMap, scanner);
					break;
				case 2:
					RegisterCustomer.unsubscribe(customerMap, scanner);
					break;
				case 3:
					UpdateCustomerDetails.updatePassword(customerMap, scanner);
					break;
				case 4:
					DisplayCustomerDetails.displayCustomers(customerMap);
					break;
				case 5:
					SortCustomerDetails.sortOnEmail(customerMap);
					break;
				case 6:
					SortCustomerDetails.sortOnDoB(customerMap);
					break;
				case 7:
					System.exit(0);
				default:
					System.out.println("Invalid choice.");
				}
				
			}while(choice != 7);
			
		} catch (Exception e) {
			if(e instanceof ParseException)
				e.printStackTrace();
			else
				e.printStackTrace();
		}

	}

}
