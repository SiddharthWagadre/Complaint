
package com.cg.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "complaint")
public class Complaint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="complaint_Id")
	private int ComplaintId;
	
	@Column(name ="productmodel_name")
	private String productModelNumber;
	
	@Column(name ="complaint_name")
	private String ComplaintName;
	
	@Column(name ="status")
	private String status;
	
	@Column(name ="client_id")
	private String clientId;
	
	@Column(name ="engineer_Id")
	private int engineerId;

	public int getComplaintId() {
		return ComplaintId;
	}

	public void setComplaintId(int complaintId) {
		ComplaintId = complaintId;
	}

	public String getProductModelNumber() {
		return productModelNumber;
	}

	public void setProductModelNumber(String productModelNumber) {
		this.productModelNumber = productModelNumber;
	}

	public String getComplaintName() {
		return ComplaintName;
	}

	public void setComplaintName(String complaintName) {
		ComplaintName = complaintName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		status = status;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public int getEngineerId() {
		return engineerId;
	}

	public void setEngineerId(int engineerId) {
		this.engineerId = engineerId;
	}

	public Complaint(int complaintId, String productModelNumber, String complaintName, String status, String clientId,
			int engineerId) {
		super();
		ComplaintId = complaintId;
		this.productModelNumber = productModelNumber;
		ComplaintName = complaintName;
		status = status;
		this.clientId = clientId;
		this.engineerId = engineerId;
	}

	public Complaint() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Complaint [ComplaintId=" + ComplaintId + ", productModelNumber=" + productModelNumber
				+ ", ComplaintName=" + ComplaintName + ", Status=" + status + ", clientId=" + clientId + ", engineerId="
				+ engineerId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ComplaintId, ComplaintName, status, clientId, engineerId, productModelNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complaint other = (Complaint) obj;
		return ComplaintId == other.ComplaintId && Objects.equals(ComplaintName, other.ComplaintName)
				&& Objects.equals(status, other.status) && Objects.equals(clientId, other.clientId)
				&& engineerId == other.engineerId && Objects.equals(productModelNumber, other.productModelNumber);
	}


	
	
}
