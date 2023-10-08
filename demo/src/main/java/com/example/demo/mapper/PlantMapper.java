package com.example.demo.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.example.demo.dto.PlantDto;
import com.example.demo.entity.PlantEntity;

@Mapper(componentModel = "spring")
public interface PlantMapper extends IEntityMapper<PlantDto, PlantEntity>{
	
	PlantDto toDto(PlantEntity e);

	PlantEntity toEntity(PlantDto d) ;

	List<PlantDto> toDto(List<PlantEntity> eList);

	List<PlantEntity> toEntity(List<PlantDto> dList) ;

}
