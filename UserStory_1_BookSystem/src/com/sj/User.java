package com.sj;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice;
		@SuppressWarnings("unused")
		String s = "";
		Database db = new Database();
		Person p = new Person();
		@SuppressWarnings("unused")
		Complaint c = new Complaint();
		
		do {
			System.out.println("Hello user...!\nPlease Enter your choice : ");
			System.out.println("1. View all available customers and their ids");
			System.out.println("2. view all the complaints of a customer using customer id");
			System.out.println("3. Select a complaint to view its status based on complaint id");
			System.out.println("4. Launch a new complaint");
			System.out.println("5. Exit from menu");
			
			choice = sc.nextInt();
			
			if (choice < 0 || choice > 5) {
				System.out.println("please enter any numnber between 1 and 4");
			}
			
			else {
				switch(choice) {
				case 1 : db.displayCustomers();
						 s = sc.nextLine();
						 break;
				case 2 : System.out.println("Enter your customer id");
					     int custid = sc.nextInt();
						 db.showAllComplaints(custid);
						 s = sc.nextLine();
						 break;
				case 3 : System.out.println("Enter the id of complaint");
					     int cid = sc.nextInt();
						 db.displayComplaintStatus(cid);
						 s = sc.nextLine();
						break;
				case 4 : p.launchComplaint();
						 s = sc.nextLine();
						 break;
				case 5 : System.out.println("Thank you..! Please visit us again");
					     return;
				default : break;
				}
			}
			
		}while(choice > 0 || choice < 5);
		
	}

}