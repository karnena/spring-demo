package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

	@Query(value = "select * from masters.master_plant where status = 1",nativeQuery = true)
	List<UserEntity> findAllByStatus();

	@Modifying
	@Transactional
	@Query(value = "update masters.master_plant set status = 0 where plant_id = :id")
	void updateById(String id);
	
	


	
	

}
