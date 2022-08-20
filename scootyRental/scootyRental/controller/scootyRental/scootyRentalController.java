
package scootyRental;

import scootyRental.outlets;
import scootyRental.user;
import scootyRental.vehicleInfo;

public class scootyRentalController {

	scootyRentalService service;

	public outlets checkNearestOutlet(float xCordinate, float yCordinate) {
		return service.checkNearestOutlet(xCordinate, yCordinate);
	}

	public int getFreeVehiclesCount(float xCordinate, float yCordinate) {
		return service.getFreeVehiclesCount(xCordinate,yCordinate);
	}

	public String reserveVehicle(vehicleInfo vehicle,outlets outlet,user userInfo) {
		return service.reserveVehicle(vehicle,outlet,userInfo);	
	}
	public String pickUpVehicle(int reservationId) {
		return service.pickUpVehicle(reservationId);   
	}
	public String endTrip(int reservationId,outlets endOulet) {
		return service.endTrip(reservationId,endOulet);
	}



}
