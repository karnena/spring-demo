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

import com.example.demo.dto.UserDto;
import com.example.demo.service.CommonService;

@RestController
@RequestMapping("/effigo/api/common/")
public class CommonController {
	
	@Autowired
	private CommonService commonService;
	
	
	@GetMapping("/getAllUsers")
	public ResponseEntity<List<UserDto>> getAllUsers() {
		List<UserDto> user = commonService.getAllUsers();
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@PatchMapping("/deleteUsers")
	public void deleteUser(@PathVariable String id) {
		commonService.deleteUser(id);


	}
	
	@PostMapping(value = "/saveUser")
	public void saveUser(
			@RequestBody UserDto userDto) {
		commonService.saveUser(userDto);


	}

}
