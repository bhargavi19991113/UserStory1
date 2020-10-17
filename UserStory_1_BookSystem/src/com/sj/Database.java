package com.sj;
public class Database {

	Customer [] customer_list;

	public Database() {
		super();
		// TODO Auto-generated constructor stub
		
		customer_list = new Person[3];
		
		Complaint [] c1 = {new Complaint(1, "t1", "c1", 0, 1), new Complaint(2, "t2", "c2", 0, 1), new Complaint(3, "t3", "c3", 0, 1)};
		Complaint [] c2 = {new Complaint(25, "t25", "c25", 0, 2), new Complaint(35, "t35", "c35", 0, 2)};
		Complaint [] c3 = {new Complaint(10, "t10", "c10", 0, 3)};
		
		customer_list[0] = new Person(1, "CustomerOne", c1);
		customer_list[1] = new Person(2, "CustomerTwo", c2);
		customer_list[2] = new Person(3, "CustomerThree", c3);
		
	}
	
	public void displayCustomers() {
		
		System.out.println("Name : bhargavi, ID : 1");
		System.out.println("Name : rishika , ID : 2");
		System.out.println("Name : padma   , ID : 3");
		System.out.println("Name : Anna    , ID : 4");
		
	}
	
	public void showAllComplaints(int custid) {
		
		System.out.println("Customer " + custid + " made");
		
		if (custid == 1) {
			System.out.println("Complaint 1 as c1");
			System.out.println("Complaint 2 as c2");
			System.out.println("Complaint 3 as c3");
		}
		
		else if (custid == 2) {
			System.out.println("Complaint 1 as c25");
			System.out.println("Complaint 2 as c35");
		}
		
		else if (custid == 3) {
			System.out.println("Complaint 1 as c10");
		}
		else if(custid==4) {
			System.out.println("No active complaints so far");
		}
		
	}
	
	public void displayComplaintStatus(int id) {
		
		Complaint c = new Complaint();
		int ch = c.status;
		
		if (ch == 0) {
			if(id%2==0)
			System.out.println("Under review..! will be resolved soon");
			else
				System.out.println("resolved");
			
		}
		
		else if (ch == 1) {
			System.out.println("Complete");
		}
		
	}
	
}