package com.core.tester;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import com.core.pojo.Customer;
import com.core.utils.StringUtils;

public class SortCustomerDetails {
	
	// treemap internally sorts elements on key, so it is a form of natural sorting.
	public static void sortOnEmail(HashMap<String, Customer> customerMap) throws Exception {
		TreeMap<String, Customer> sortedTreeMap = new TreeMap<String, Customer>();
		sortedTreeMap.putAll(customerMap);
		StringUtils.printLine();
		System.out.println("Sorted on Email: ");
		Set<Entry<String, Customer>> entries = sortedTreeMap.entrySet();
		for(Entry<String, Customer> entry : entries) {
			System.out.println(entry.getKey() + " |\t" + entry.getValue());
		}
	}
	
	public static void sortOnDoB(HashMap<String, Customer> customerMap) throws Exception {
		Collection<Customer> collection = customerMap.values();
		LinkedList<Customer> customerList = new LinkedList<Customer>(collection);
		Collections.sort(customerList, new Comparator<Customer>() {
			@Override
			public int compare(Customer c1, Customer c2) {
				return c1.getBdate().compareTo(c2.getBdate());
			}
		});
		StringUtils.printLine();
		System.out.println("Sorted on DoB: ");
		for(Customer c: customerList)
			System.out.println(StringUtils.getSdf().format(c.getBdate()) + " | " + c);
	}
	//descending order sort
}
