package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.UserRepository;

@Service
public class CommonService {
	
	@Autowired 
	UserRepository userRepository;
	
	@Autowired
	UserMapper userMapper;
	
	public List<UserDto> getAllUsers() {
		return userMapper.toDto(userRepository.findAllByStatus());
		
	}
	
	public void deleteUser(String id) {
	 userRepository.updateById(id);
	}
	
	public void saveUser(UserDto userDto) {
		UserEntity userEntity = userMapper.toEntity(userDto);
		userRepository.save(userEntity);
	}

}
