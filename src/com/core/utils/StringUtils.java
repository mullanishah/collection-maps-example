package com.core.utils;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StringUtils {
	
	private static SimpleDateFormat sdf;
	private static Scanner scanner;
	static {
		sdf = new SimpleDateFormat("dd/mm/yyyy");
		scanner = new Scanner(System.in);
	}
	
	public static Scanner getScanner() {
		return scanner;
	}
	
	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	
	public static void printLine() {
		System.out.println("==================================");
	}
}
