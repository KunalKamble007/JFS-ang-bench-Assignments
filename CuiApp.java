package com.capg.assignments;

import java.util.Scanner;

public class CuiApp {
	
	 static String username = null, password = null;
	    static String validUsername = "Kunal";
	    static String validPassword = "Kunal";
	    static Scanner scan = new Scanner(System.in);
	    static int count = 0;

	public static void main(String[] args) {

	     for(int i=0;i<3;i++) {
	            System.out.print("Enter your username : ");
	            username = scan.next();
	            System.out.print("Enter your password : ");
	            password = scan.next();
	            validateUser(username,password);
	        }
	}

	public static void validateUser(String username, String password) {
		// TODO Auto-generated method stub

        if(username.equals(validUsername) && password.equals(validPassword)) {
            System.out.println("Welcome, " + username);
            count = 0;
            scan.close();
            System.exit(0);
        } else {
            System.out.println("Invalid Username or Password");
            count ++;
        }

        if(count == 3) {
            System.out.println("Contact Admin");
            scan.close();
            System.exit(0);
        }
		
	}
}
