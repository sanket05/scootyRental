package scootyRental;

import java.util.Date;

import scootyRental.*;

public class defaultScootyRentalService implements scootyRentalService {
	scootyRentalConstants constants;
	
	@Override
	public outlets checkNearestOutlet(float xCordinate, float yCordinate) {
        outlets nearestOutlet=constants.outletList.get(0);
		for(outlets outlet : constants.outletList) {
           if(distanceBetweenPoints(xCordinate,nearestOutlet.location.xCoordinate,yCordinate,nearestOutlet.location.yCoordinate)
        		   <distanceBetweenPoints(xCordinate,outlet.location.xCoordinate,yCordinate,outlet.location.yCoordinate)) {
        	   nearestOutlet=outlet;
           }
        }
		
		return nearestOutlet;
	}

	private double distanceBetweenPoints(float x1, float x2, float y1, float y2) {
		 return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));		
	}

	@Override
	public int getFreeVehiclesCount(float xCordinate, float yCordinate) {
		outlets nearestOutlet=checkNearestOutlet(xCordinate,yCordinate);
		return nearestOutlet.totalVehicles;
	}

	@Override
	public String reserveVehicle(vehicleInfo vehicle, outlets outlet,user userInfo) {
		for(vehicleInfo vehicleAvailable : outlet.vehicleList) {
			if(vehicleAvailable.vehicleNumber.equals(vehicle.vehicleNumber)) {
				if(!vehicleAvailable.isReserved) {
					vehicleAvailable.isReserved=true;
					vehicleReservation reservedVehical=new vehicleReservation(userInfo,"BOOKED",new Date(),vehicle.getVehicleLocation(),vehicle);
				return "Vehicle reserved Successfully";
				}
			}
		}
		return "No vehicles available for reservation";
		
	}

	@Override
	public String pickUpVehicle(int reservationId) {
	   
		for(vehicleReservation reservedVehicles :  constants.reservedvehicleList) {
			if(reservedVehicles.getReservationId()==reservationId) {
				int time=(reservedVehicles.dateOfBooking.getMinutes())-new Date().getMinutes();
				if(constants.maxReservationDuration<time && !reservedVehicles.isPickedUp) {
                    reservedVehicles.setIsPickedUp(true);
                    return "Thank you!! drive safely";
                    
				}
			}
		}
		return "No reservation found";
	}

	@Override
	public String endTrip(int reservationId,outlets endOutlet) {
		for(vehicleReservation reservedVehicles :  constants.reservedvehicleList) {
			if(reservedVehicles.getReservationId()==reservationId) {
				  if(endOutlet.totalVehicles>=constants.maxVehiclesAllowed) {
					  return "No Parking slot available in this outlet";
				  }
			      reservedVehicles.setDateOfReturning(new Date());
			      int fare= constants.farePerDay *(reservedVehicles.getDateOfReturning().getDay()-reservedVehicles.getDateOfBooking().getDay());
			      return "Your total fare is" + fare;
			}
		}
		
		return "Please Check scooty resgistration number";
	}
  
 
}
