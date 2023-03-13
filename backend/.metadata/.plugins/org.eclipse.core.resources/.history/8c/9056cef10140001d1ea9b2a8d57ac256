package com.comfortatyourdoorstep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.comfortatyourdoorstep.entities.ServiceProvider;

@Repository
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Integer>{
	
    @Query(value = "select * from serviceprovider_tbl where id=:id", nativeQuery=true)
	public ServiceProvider findByProviderId(int id);

}
