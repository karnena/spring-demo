package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "master_plant", schema = "masters")
public class PlantEntity {
	
	@Id
	@GeneratedValue(generator = "UUIDGenerator")
	@GenericGenerator(name = "UUIDGenerator", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "plant_id")
	private String plantId;
	
	@Column(name = "plant_name")
	private String plantName;
	
	@Column(name = "entity_id")
	private String entityId;
	
	@Column(name = "status")
	private Integer status;

}
