package com.factory.cars;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{

	@Override
	public List<Car> getMercedes() {
		List<Car> mercedes = new ArrayList<Car>();
		
		Car car = new Car(1,"mercedes");
		mercedes.add(car);
		return mercedes;
	}

	@Override
	public List<Car> getMacdas() {
		List<Car> macdas = new ArrayList<Car>();
		
		Car car = new Car(1,"macda");
		macdas.add(car);
		return macdas;
	}

}
