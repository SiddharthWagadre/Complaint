package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Complaint;
import com.cg.exception.InValidCompliantIdException;
import com.cg.service.ComplaintService;



	@RestController
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("complaint")
	public class ComplaintController {
		
		
		@Autowired
		ComplaintService complaintService;
		
		//http://food-service/complaint/all
			@GetMapping("/all")
			public List<Complaint> getClientAllComplaints(){
				return complaintService.getClientAllComplaints();
			}
			//http://localhost:9091/complaint/book
			@PostMapping("/book")
			public Complaint bookComplaint(@Valid@RequestBody Complaint complaint)  {
				Complaint complaintDetails = complaintService.bookComplaint(complaint);
				
				return complaintDetails;
			}
			//http://localhost:9091/complaint/update
			@PutMapping("/update")
			public Complaint updateComplaint(@Valid@RequestBody Complaint complaint) throws InValidCompliantIdException {
				Complaint complaintDetails = complaintService.changeComplaintStatus(complaint);
				
				return complaintDetails;
			}

			/*@GetMapping("/search")
			List<Complaint> findByStatus(@RequestParam("status") String status)
			{
				return complaintService.getClientAllOpenComplaints(status);
			}*/
			
			 @GetMapping("/status/{status}")
		public List<Complaint> getComplaintByStatus(@Valid@PathVariable String status) throws InValidCompliantIdException {
			List<Complaint> complaintDetails = complaintService.getClientAllOpenComplaints(status);
			
			return complaintDetails;
		}

			 

}

