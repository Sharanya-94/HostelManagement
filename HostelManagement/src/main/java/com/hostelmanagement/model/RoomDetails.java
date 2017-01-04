package com.hostelmanagement.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roomavailability1")
public class RoomDetails {
	public RoomDetails() {
		super();
	}
	@Id
	private int sharing;
	@Override
	public String toString() {
		return "RoomDetails [sharing=" + sharing+" sharing" + ", FirstFlloor=" + FirstFlloor + ", SecondFloor=" + SecondFloor
				+ ", ThirdFloor=" + ThirdFloor + "]";
	}
	private int FirstFlloor;
	private int SecondFloor;
	private int ThirdFloor;
	public RoomDetails(int sharing, int firstFlloor, int secondFloor, int thirdFloor) {
		super();
		this.sharing = sharing;
		FirstFlloor = firstFlloor;
		SecondFloor = secondFloor;
		ThirdFloor = thirdFloor;
	}
	public int getSharing() {
		return sharing;
	}
	public void setSharing(int sharing) {
		this.sharing = sharing;
	}
	public int getFirstFlloor() {
		return FirstFlloor;
	}
	public void setFirstFlloor(int firstFlloor) {
		FirstFlloor = firstFlloor;
	}
	public int getSecondFloor() {
		return SecondFloor;
	}
	public void setSecondFloor(int secondFloor) {
		SecondFloor = secondFloor;
	}
	public int getThirdFloor() {
		return ThirdFloor;
	}
	public void setThirdFloor(int thirdFloor) {
		ThirdFloor = thirdFloor;
	}
	
}
