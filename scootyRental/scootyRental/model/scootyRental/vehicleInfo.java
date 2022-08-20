
package scootyRental;


public class vehicleInfo {
	public String nameOfVehicle;
	public String vehicleNumber;
	public boolean isReserved;
	public vehicleLocation vehicleLocation;
	public vehicleLocation getVehicleLocation() {
		return vehicleLocation;
	}
	public void setVehicleLocation(vehicleLocation vehicleLocation) {
		this.vehicleLocation = vehicleLocation;
	}
	public void setReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
	public String getNameOfVehicle() {
		return nameOfVehicle;
	}
	public void setNameOfVehicle(String nameOfVehicle) {
		this.nameOfVehicle = nameOfVehicle;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public boolean getIsReserved() {
		return isReserved;
	}
	public void setIsReserved(boolean isReserved) {
		this.isReserved = isReserved;
	}
	
	}
