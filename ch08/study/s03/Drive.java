package ch08.study.s03;

public class Drive {
	void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus bus)
			bus.checkFare();
		vehicle.run();
	}
}
