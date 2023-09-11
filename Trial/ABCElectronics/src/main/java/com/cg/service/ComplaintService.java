package com.cg.service;

import java.util.List;

import com.cg.entity.Complaint;


public interface ComplaintService {


public List<Complaint> getClientAllComplaints();
	
	public Complaint bookComplaint(Complaint complaint);
	
	public Complaint changeComplaintStatus(Complaint complaint);
	
	public List<Complaint> getClientAllOpenComplaints(String status );

	
}
