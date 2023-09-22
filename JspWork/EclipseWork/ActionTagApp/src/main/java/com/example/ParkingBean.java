package com.example;

import java.util.Vector;

//------------------------------------
//enter w String
//exit w String
//total r int
//car r CarDto
//carList r carDto[]
public class ParkingBean {
	// 차에 대한 정보 저장 
	private Vector carList = new Vector();
	
	public void setEnter(String plateNumber) {
		
		carList.add(new CarDto(plateNumber, System.currentTimeMillis()));
		
	}

	public void setExit(String plateNumber) {
		CarDto car = null;
		for(int i=0; i<carList.size(); i++) {
			car = (CarDto) carList.get(i);
			if(plateNumber.equals(car.getPlateNumber())) {
				carList.remove(i);
				break;
			}
		}
	}
	
	public int getTotal() {
		return carList.size();
	}
	
	public CarDto getCar() {
		return null;
	}
	
	public CarDto[] getCarList() {
		CarDto[] cars = new CarDto[carList.size()];
		for(int i = 0; i<cars.length; i++) {
			cars[i] = (CarDto)carList.get(i);
		}
		return cars;
	}
}
