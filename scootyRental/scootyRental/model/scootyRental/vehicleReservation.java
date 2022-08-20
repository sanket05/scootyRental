package scootyRental;

import java.util.Date;

import scootyRental.scootyRentalConstants;

public class vehicleReservation {
	scootyRentalConstants constants;
	
	public int reservationId;
	public user bookedBy;
	public String reservationStatus;
	public Date dateOfBooking;
	public Date dateOfReturning;
	public Date dueDate;
	public vehicleLocation vehicleBookedLocation;
	public vehicleLocation vehicleReturnedLocation;
	public vehicleInfo vehicle;
	public boolean isPickedUp=false;
	public scootyRentalConstants getConstants() {
		return constants;
	}
	public void setConstants(scootyRentalConstants constants) {
		this.constants = constants;
	}
	public vehicleInfo getVehicle() {
		return vehicle;
	}
	public void setVehicle(vehicleInfo vehicle) {
		this.vehicle = vehicle;
	}
	public boolean getIsPickedUp() {
		return isPickedUp;
	}
	public void setIsPickedUp(boolean isPickedUp) {
		this.isPickedUp = isPickedUp;
	}
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
	public user getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(user bookedBy) {
		this.bookedBy = bookedBy;
	}
	public String getReservationStatus() {
		return reservationStatus;
	}
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	public Date getDateOfBooking() {
		return dateOfBooking;
	}
	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}
	public Date getDateOfReturning() {
		return dateOfReturning;
	}
	public void setDateOfReturning(Date dateOfReturning) {
		this.dateOfReturning = dateOfReturning;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public vehicleLocation getVehicleBookedLocation() {
		return vehicleBookedLocation;
	}
	public void setVehicleBookedLocation(vehicleLocation vehicleBookedLocation) {
		this.vehicleBookedLocation = vehicleBookedLocation;
	}
	public vehicleLocation getVehicleReturnedLocation() {
		return vehicleReturnedLocation;
	}
	public void setVehicleReturnedLocation(vehicleLocation vehicleReturnedLocation) {
		this.vehicleReturnedLocation = vehicleReturnedLocation;
	}
	public vehicleInfo getVehical() {
		return vehicle;
	}
	public void setVehical(vehicleInfo vehical) {
		this.vehicle = vehical;
	}
	
	 public vehicleReservation(user bookedBy,String reservationStatus,Date dateOfBooking,
	 vehicleLocation vehicleBookedLocation,
	 vehicleInfo vehicle ) {
		 this.reservationId=constants.maxReservationId;
		 constants.maxReservationId++;
		 this.bookedBy=bookedBy;
		 this.dateOfBooking=dateOfBooking;
		 this.reservationStatus=reservationStatus;
		 this.vehicle=vehicle;
		 this.vehicleBookedLocation=vehicleBookedLocation;
		
	}
	

}
