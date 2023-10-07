package com.example.demo.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiResponse {

	private String statusCode;
	private boolean status;
	private String message;
	private String errorCode;

}
