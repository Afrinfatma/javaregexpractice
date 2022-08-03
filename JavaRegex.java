package com.javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex {
	static String firstNameRegex="^[a-zA-Z]*";
	static String lastNameRegex="^[a-zA-Z]*";
	static String emailRegex="^[A-za-z0-9]+([.+-][A-za-z0-9]+)?[@][a-z0-9]+[.][a-z]{2,3}([.][a-z]{2})?$";
	static Pattern pattern;
	static Matcher matcher;
	static String pinCodeRegex="^[0-9]{3}[0-9]{3}$";
	static String pinCodeWithSpaceRegex="^[0-9]{3}\s[0-9]{3}$";
	
	
	public static boolean firstName(String firstName ) {
        pattern =Pattern.compile(firstNameRegex);
        matcher=pattern.matcher(firstName);
        return matcher.matches();
	}
	public static boolean lastName(String lastName ) {
        pattern =Pattern.compile(lastNameRegex);
        matcher=pattern.matcher(lastName);
        return matcher.matches();
	}
	public static boolean email(String email ) {
        pattern =Pattern.compile(emailRegex);
        matcher=pattern.matcher(email);
        return matcher.matches();
	} 
	public static boolean pinCode(String pincode ) {
        pattern =Pattern.compile(pinCodeRegex);
        matcher=pattern.matcher(pincode);
        return matcher.matches();
}

	 public static boolean pinCodeSR(String pincode2 ) {
         pattern =Pattern.compile(pinCodeWithSpaceRegex);
		matcher=pattern.matcher(pincode2);
         return matcher.matches();
	}
		public static void main(String[] args) {
		System.out.println("First Name= " +firstName("Afrin"));
		System.out.println("Last Name= " +firstName("Fatma"));
		System.out.println("Email= " +email("abc.xyz@bridgelabz.co.in"));
		System.out.println("Pin Code= " +pinCode("486652"));
		System.out.println("Pin Code 2= " +pinCodeSR("486 652"));
		System.out.println("Pin Code= " +pinCode("A988657"));
		System.out.println("Pin Code= " +pinCode("988657B"));
	}

}
