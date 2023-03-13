package com.comfortatyourdoorstep.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.comfortatyourdoorstep.entities.ServiceSeeker;

@Transactional
@Repository
public interface ServiceSeekerRepository extends JpaRepository<ServiceSeeker, Integer> {


	@Modifying
    @Query(value = "delete from ServiceSeeker where id=:id")
	void deleteByEmail(@Param("id")int id);

	@Query(value ="select * from service_seeker where email=:email",nativeQuery = true)
	List<ServiceSeeker> getMyBooking(String email);

	

}
