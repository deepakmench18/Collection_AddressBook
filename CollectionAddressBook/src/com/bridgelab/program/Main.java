package com.bridgelab.program;

import java.util.Scanner;

public class Main {
	AddressBook addressBookManager = new AddressBook();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main mainObj = new Main();
		boolean flag = true;
		do {
			System.out.println("Enter the choices");
			System.out.println("1. Add new Contact");
			System.out.println("2. Update Contact");
			System.out.println("3. Remove person");
			System.out.println("4. get person details");
			System.out.println("5. Print Address Book");
			System.out.println("6. Store current address");
			System.out.println("7. Print all Address Book");
			System.out.println("8. create new address book");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				mainObj.addressBookManager.addPersonDetails();
				break;
			case 2:
				mainObj.addressBookManager.updatePersonDetails();
				break;
			case 3:
				mainObj.addressBookManager.removePersonDetails();
				break;
			case 4:
				System.out.print("Enter Person name: ");
				String name = sc.next();
				Contact details  = mainObj.addressBookManager.getperson(name);
				System.out.println("person details = "+details);
				break;
			case 5:
				mainObj.addressBookManager.printPersonDetails();
				break;
			case 6:
				mainObj.addressBookManager.storeCurrentAddressBook();
				break;
			case 7:
				mainObj.addressBookManager.printAddressBooks();
				break;
			case 8:
				mainObj.addressBookManager.creatNewAddressBooks();
				break;
			default:
				flag = false;
			}
		}while(flag);
	}
}