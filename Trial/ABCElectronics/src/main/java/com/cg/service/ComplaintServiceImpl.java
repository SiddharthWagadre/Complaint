package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Complaint;
		
import com.cg.exception.InValidCompliantIdException;
import com.cg.repository.ComplaintRepository;

@Service
public class ComplaintServiceImpl implements ComplaintService{

	@Autowired
	private ComplaintRepository complaintRepository;

	@Override
	public List<Complaint> getClientAllComplaints() {
		
		return complaintRepository.findAll();
	}

	@Override
	public Complaint bookComplaint(Complaint complaint) {
		
			return complaintRepository.save(complaint);
	}
	
public Complaint changeComplaintStatus(Complaint complaint) throws InValidCompliantIdException{
		
		if (!complaintRepository.existsById(complaint.getComplaintId()))
			throw new InValidCompliantIdException("Id not found");
		else {
//			Optional<Food> temp = foodRepo.findById(food.getFoodId());
//			temp.get().setCost(food.getCost());
//			return foodRepo.save(temp.get());
			return complaintRepository.save(complaint);
		}
			
	}

/*	@Override
	public Complaint changeComplaintStatus(Complaint complaint) {
Optional<Complaint> complaintDb = this.complaintRepository.findById(complaint.getComplaintId());
		
		if(complaintDb.isPresent()) {
			Complaint complaintUpdate = complaintDb.get();
			complaintUpdate.setStatus(null);
			return complaintUpdate;
			
		}else {
			throw new InValidCompliantIdException("Record not found with id:"+complaint.getClientId());
		}
	}*/

	
	/*public List<Complaint> getClientAllOpenComplaints(String status) {
		
			return complaintRepository.findByTypeIgnoreCase(status);
		
	}*/
	public List<Complaint> getClientAllOpenComplaints(String status) throws InValidCompliantIdException{
		if((complaintRepository.findByStatusIgnoreCase(status).isEmpty()) || complaintRepository.findByStatusIgnoreCase(status)==null) {
			throw new InValidCompliantIdException("no open coplaints found");
		}
		else {
			return complaintRepository.findByStatusIgnoreCase(status);
		}
	}


}
