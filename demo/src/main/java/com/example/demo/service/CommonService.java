package com.example.demo.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PlantDto;
import com.example.demo.entity.PlantEntity;
import com.example.demo.mapper.PlantMapper;
import com.example.demo.repository.PlantRepository;

@Service
public class CommonService {
	
	@Autowired 
	PlantRepository plantRepository;
	
	@Autowired
	PlantMapper plantMapper;
	
	public List<PlantDto> getAllPlants() {
		return plantMapper.toDto(plantRepository.findAllByStatus());
		
	}
	
	public void deletePlant(String id) {
	 plantRepository.updateById(id);
	}
	
	public void savePlant(PlantDto plantDto) {
		PlantEntity plantEntity = plantMapper.toEntity(plantDto);
		plantRepository.save(plantEntity);
	}

}
