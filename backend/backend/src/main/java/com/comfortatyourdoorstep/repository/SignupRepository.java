package com.comfortatyourdoorstep.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.comfortatyourdoorstep.entities.Address;
import com.comfortatyourdoorstep.entities.Admin;
import com.comfortatyourdoorstep.entities.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup, Integer> {
	

	@Query(value ="select * from signup_tbl where email=:email",nativeQuery = true)
	public Signup getUserByUsernamePassword(String email);
	
	
	@Query(value ="select id from address_tbl where hobby=:hobby",nativeQuery = true)
	public List<Integer> getId(String hobby);

	
	@Query(value ="select * from signup_tbl where address_id=:addressid",nativeQuery = true)
	public Signup getPassword(int addressid);


	@Modifying
	@Transactional
	@Query(value="update signup_tbl set password=:newpassword where password=:password",nativeQuery = true)
	public Signup setNewPassword(String password, String newpassword);
	
	
	@Modifying
	@Transactional
	@Query(value="update signup_tbl set password=:newpassword where password=:password",nativeQuery = true)
	public void setMyNewPassword(String password, String newpassword);


	@Query(value ="select * from signup_tbl where password=:newpassword",nativeQuery = true)
	public Signup getResult(String newpassword);


	public Address save(Address address);
	
	
	@Query(value ="select * from signup_tbl where email=:username",nativeQuery = true)
	public Signup getUserByUserName(String username);

	@Query(value ="select * from signup_tbl where email=:email",nativeQuery = true)
	public Signup getLoginDetails(String email);

	

	
}
