package com.mindfire.reviewsofcar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindfire.reviewsofcar.domain.UserDetails;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,Long>{
	
	public List<UserDetails> findByUsername(String username);
	public List<UserDetails> findByEmail(String email);
	
	

}