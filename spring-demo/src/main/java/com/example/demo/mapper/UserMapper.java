package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper extends IEntityMapper<UserDto, UserEntity>{
	
	UserDto toDto(UserEntity e);

	UserEntity toEntity(UserDto d) ;

	List<UserDto> toDto(List<UserEntity> eList);

	List<UserEntity> toEntity(List<UserDto> dList) ;

}
