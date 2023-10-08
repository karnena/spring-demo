package com.example.demo.repository;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.PlantDto;
import com.example.demo.entity.PlantEntity;

@Repository
public interface PlantRepository extends JpaRepository<PlantEntity, String>{

	@Query(value = "select * from masters.master_plant where status = 1",nativeQuery = true)
	List<PlantEntity> findAllByStatus();

	@Modifying
	@Transactional
	@Query(value = "update masters.master_plant set status = 0 where plant_id =:id",nativeQuery = true)
	void updateById(String id);
	
	
	

}
