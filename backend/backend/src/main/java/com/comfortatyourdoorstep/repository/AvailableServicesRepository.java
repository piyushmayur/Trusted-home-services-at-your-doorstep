package com.comfortatyourdoorstep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.comfortatyourdoorstep.entities.AvailableServices;


@Repository
public interface AvailableServicesRepository extends JpaRepository<AvailableServices, Integer> {

}
 