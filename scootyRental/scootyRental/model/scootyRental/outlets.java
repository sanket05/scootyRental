package scootyRental;

import java.util.*;

public class outlets extends vehicleInfo {

	public String name;
	public address location;
	public String ownerName;
	public int totalVehicles;
	public List<vehicleInfo>vehicleList; 
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public address getLocation() {
		return location;
	}


	public void setLocation(address location) {
		this.location = location;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public int getTotalVehicles() {
		return totalVehicles;
	}


	public void setTotalVehicles(int totalVehicles) {
		this.totalVehicles = totalVehicles;
	}


	public outlets() {
		// TODO Auto-generated constructor stub
	}

}
