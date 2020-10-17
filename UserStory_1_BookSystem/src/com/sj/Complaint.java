package com.sj;
public class Complaint {

	int id;
	String CTitle;
	String description;
	int status,customer_id;
	
	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Complaint(int id, String title, String description, int status, int customer_id) {
		super();
		this.id = id;
		this.CTitle = title;
		this.description = description;
		this.status = status;
		this.customer_id = customer_id;
	}
	
	@Override
	public String toString() {
		return "Complaint [complaint_id=" + id + ", title=" + CTitle + ", description=" + description
				+ ", status=" + status + ", customer_id=" + customer_id + "]";
	}
	
}