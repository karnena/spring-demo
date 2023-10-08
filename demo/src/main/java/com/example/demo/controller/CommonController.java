package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.PlantDto;
import com.example.demo.service.CommonService;

@RestController
@RequestMapping("/effigo/api/common/")
public class CommonController {
	
	@Autowired
	private CommonService commonService;
	
	
	@GetMapping("/getAllPlants")
	public ResponseEntity<List<PlantDto>> getAllPlants() {
		List<PlantDto> plant = commonService.getAllPlants();
		return new ResponseEntity<>(plant, HttpStatus.OK);
	}
	
	@PatchMapping("/deletePlant/{id}")
	public void deletePlant(@PathVariable String id) {
	
			commonService.deletePlant(id);
	
	}
	
	@PostMapping(value = "/savePlant")
	public void savePlant(
			@RequestBody PlantDto plantDto) {
			commonService.savePlant(plantDto);
	
	}

}
