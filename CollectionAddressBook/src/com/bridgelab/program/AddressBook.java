package com.bridgelab.program;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class AddressBook {
	Scanner sc = new Scanner(System.in);
	
	void addPersonDetails(){
		System.out.print("Enter firstName: ");
		String firstName = sc.next();
		System.out.print("Enter lastName: ");
		String lastName = sc.next();
		System.out.print("Enter address: ");
		String address = sc.next();
		System.out.print("Enter city: ");
		String city = sc.next();
		System.out.print("Enter state: ");
		String state = sc.next();
		System.out.print("Enter email: ");
		String email = sc.next();
		System.out.print("Enter zip: ");
		int zip = sc.nextInt();
		System.out.print("Enter phoneNumber: ");
		int phoneNumber = sc.nextInt();
		
		Contact personDetails = new Contact();
		personDetails.setFirstName(firstName);
		personDetails.setLastName(lastName);
		personDetails.setAddress(address);
		personDetails.setCity(city);
		personDetails.setState(state);
		personDetails.setEmail(email);
		personDetails.setZip(zip);
		personDetails.setPhoneNumber(phoneNumber);
		
		if(addressBookList.size() == 0)
			addPerson(personDetails);
		else {
			addressBookList.stream().forEach(i -> {if(i.getFirstName().contains(firstName)) { 
				System.out.println("Contact Already Exist");
				return;
			}addPerson(personDetails);});
		}
	}

	
	Map<String, List> storeAddressBooks = new HashMap();
	List<Contact> addressBookList = new ArrayList();
	void addPerson(Contact address) {
		addressBookList.add(address);
	}
	
	
	Contact getperson(String name) {
		Iterator iterator = addressBookList.iterator();
		for(Contact elements : addressBookList ) {
			if (iterator.hasNext()) {
				Contact item = (Contact) iterator.next();
				if(item.getFirstName().equalsIgnoreCase(name)) {
					return item;
				}
			}		
		}
		return null;	
	}
	
	void updatePersonDetails() {
		System.out.print("Enter person name: ");
		String item = sc.next();
		Contact bookitem = getperson(item);
		System.out.println(bookitem);
		
		System.out.println("1. update firstname");
		System.out.println("2. update Lastname");
		System.out.println("3. update address");
		System.out.println("4. update city");
		System.out.println("5. update state");
		System.out.println("6. update email");
		System.out.println("7. update zip");
		System.out.println("8. update phone number");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Enter new first name: ");
				String fname = sc.next();
				bookitem.setFirstName(fname);
				break;
			case 2:
				System.out.println("Enter new last name: ");
				String lname = sc.next();
				bookitem.setLastName(lname);
				break;
			case 3:
				System.out.println("Enter new address: ");
				String address = sc.next();
				bookitem.setAddress(address);
				break;
			 case 4:
				 System.out.println("Enter new city: ");
				 String city = sc.next();
				 bookitem.setCity(city);
	             break;
			 case 5:
				 System.out.println("Enter new State: ");
				 String state = sc.next();
				 bookitem.setState(state);
				 break;
			 case 6:
				 System.out.println("Enter new Email: ");
				 String email = sc.next();
				 bookitem.setEmail(email);
				 break;
			 case 7:
				 System.out.println("Enter new ZipCode: ");
				 int zip = sc.nextInt();
				 bookitem.setZip(zip);
				 break;
			 case 8:
				 System.out.println("Enter new phone number: ");
				 int phonnum = sc.nextInt();
				 bookitem.setPhoneNumber(phonnum);
				 break;
		}
		System.out.println("Updated details = "+bookitem);
	}
	

	void removePersonDetails() {
		System.out.print("Enter person name: ");
		String name = sc.next();
		Contact personDetails = getperson(name);
		addressBookList.remove(personDetails);
		System.out.print("Deleted contact = "+personDetails);
	}
	

	void printPersonDetails() {
		for(Contact Items: addressBookList) {
			System.out.println(Items);
		}
	}
	

	public void storeCurrentAddressBook() {
		System.out.println("Enter name for address book: ");
		String addressBookName = sc.next();
		storeAddressBooks.put(addressBookName, addressBookList);
	}
	

	public void printAddressBooks() {
		System.out.println(storeAddressBooks);
		System.out.println("Address book is stored");
	}

	@Override
	public String toString() {
		return "AddressBookManager [storeAddressBooks=" + storeAddressBooks + ", addressBookList=" + addressBookList
				+ ", sc=" + sc + "]";
	}
	
	public void creatNewAddressBooks() {
		addressBookList.clear();
		System.out.println("New Address book is created");
	}
}