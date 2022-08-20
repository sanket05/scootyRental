package scootyRental;

import scootyRental.*;

interface scootyRentalService {
 
   public outlets checkNearestOutlet(float xCordinate, float yCordinate);
   public int getFreeVehiclesCount(float xCordinate, float yCordinate);
   public String reserveVehicle(vehicleInfo vehicle,outlets outlet,user userInfo);
   public String pickUpVehicle(int reservationId);
   public String endTrip(int reservationId,outlets endOutlate);   
}
