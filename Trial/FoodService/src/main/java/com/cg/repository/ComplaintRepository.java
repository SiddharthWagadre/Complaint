package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Complaint;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Integer> {

	//List<Complaint> findByTypeIgnoreCase(String status);

//Iterable <Complaint> findByStatus(String status);
	List<Complaint> findByStatusIgnoreCase(String status);
}
