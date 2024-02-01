package com.neosoft.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ParkingManager {
	
//	private Integer id;
	private Integer spaceSize;
	private List<Car> li;
	
	public ParkingManager(Integer size) {
		this.spaceSize=size;
		li=new ArrayList<>();
	}
	
	public String parking(Car car) {
		li.add(car);
		return "car is parked successfully";
	}
	/*public String exit(Car car) {
		LocalDateTime ldt=LocalDateTime.now();
		LocalDateTime enrty=car.getEntryTime();
		ld
	}*/
	
	

}
