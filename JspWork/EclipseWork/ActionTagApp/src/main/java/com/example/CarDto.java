package com.example;

import java.util.Date;

//name r/w datatype
//------------------------------------
//plateNumber r String
//parkingTime r java.util.Date
public class CarDto {
	private String plateNumber;
	private long parkingTime;
	
	// 기본생성자 명시
	public CarDto() {
		
	}
	// setter가 없는데 어떻게 값을 받아오겠냐? -> getter에서 생성
	public CarDto(String plateNumber, long parkingTime) {
		this.plateNumber = plateNumber;
		this.parkingTime = parkingTime;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public Date getParkingTime() {
		return new Date(parkingTime);
	}
}
