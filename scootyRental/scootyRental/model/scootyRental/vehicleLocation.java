package scootyRental;

public class vehicleLocation extends address {

	private String name;
	private int parkingSlotNo;
	private address location;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getParkingSlotNo() {
		return parkingSlotNo;
	}


	public void setParkingSlotNo(int parkingSlotNo) {
		this.parkingSlotNo = parkingSlotNo;
	}


	public address getLocation() {
		return location;
	}


	public void setLocation(address location) {
		this.location = location;
	}


	public vehicleLocation() {
		// TODO Auto-generated constructor stub
	}

}
