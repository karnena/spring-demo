//package com.example.demo.dto;
//
//
//import org.springframework.http.HttpStatus;
//
//
//
//public class AppUtil {
//	private AppUtil() {
//
//	}
//
//	public static ApiResponse getAPISuccessResponse() {
//		ApiResponse apiResponse = ApiResponse.builder().build();
//		apiResponse.setMessage(AppConstants.DATABASE_MSG_INSERT);
//		apiResponse.setStatus(true);
//		apiResponse.setStatusCode(HttpStatus.CREATED.toString());
//		return apiResponse;
//	}
//
//	public static ApiResponse getAPIFailureResponse() {
//		ApiResponse apiResponse = ApiResponse.builder().build();
//		apiResponse.setMessage(AppConstants.DATABASE_MSG_ERROR);
//		apiResponse.setStatus(false);
//		apiResponse.setStatusCode(HttpStatus.BAD_REQUEST.toString());
//		return apiResponse;
//	}
//
//
//
//	public static ApiResponse getAPIDeleteResponse() {
//		ApiResponse apiResponse = ApiResponse.builder().build();
//		apiResponse.setMessage(AppConstants.DATABASE_MSG_DELETE);
//		apiResponse.setStatus(true);
//		apiResponse.setStatusCode(HttpStatus.CREATED.toString());
//		return apiResponse;
//	}
//
//	
//}
