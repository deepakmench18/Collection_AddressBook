package com.bridgelab.program;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
		
			AddressBook contact = new AddressBook();
			
			while (true) 
			{
				System.out.println("Please choose from below choices .");
				System.out.println(" 1 Add Contact ");
				System.out.println(" 2 Edit Contact ");
				System.out.println(" 3 Delete Contact ");
				System.out.println(" 4 Display Contact ");
				System.out.println(" 5 Quit ");
				int userChoice = scanner.nextInt();
				switch (userChoice) 
				{
					case 1:
						contact.addContact();	
						break;
					case 2:
						System.out.println("Enter the Phone Number");
						String phoneNumber = scanner.next();
						contact.editContact(phoneNumber);	
						
					case 3:
						System.out.println("Enter the Phone Number");
						String phoneNumberToDel = scanner.next();
						 contact.deleteContact(phoneNumberToDel);
						 break;
					case 4:	
						contact.displayContact();
						break;
					default:
						System.out.println(" Quit");
						System.exit(0);
				}
			}
		}
	}
