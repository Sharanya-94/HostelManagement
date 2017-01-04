package com.hostelmanagement.model;

import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.Part;

@Entity
@Table(name = "residentregister")
public class Register {

	@Id
	private long mobileNum;
	private String firstName;
	private String lastName;
	private String email;
	private String pwd;
	private String city;
	private Date joiningDate;
	private int roomNumber;
	private float advancePaid;

	/* private Part idProof; */

	public Register() {
		// TODO Auto-generated constructor stub

	}

	public Register(long mobileNum, String firstName, String lastName, String email, String pwd, String city,
			Date joiningDate, int roomNumber, float advancePaid) {
		super();
		this.mobileNum = mobileNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pwd = pwd;
		this.city = city;
		this.joiningDate = joiningDate;
		this.roomNumber = roomNumber;
		this.advancePaid = advancePaid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public float getAdvancePaid() {
		return advancePaid;
	}

	public void setAdvancePaid(float advancePaid) {
		this.advancePaid = advancePaid;
	}

	/*
	 * public Part getIdProof() { return idProof; }
	 * 
	 * public void setIdProof(Part idProof) { this.idProof = idProof; }
	 */

	@Override
	public String toString() {
		return "Register [mobileNum=" + mobileNum + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", pwd=" + pwd + ", city=" + city + ", joiningDate=" + joiningDate
				+ ", roomNumber=" + roomNumber + ", advancePaid=" + advancePaid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(advancePaid);
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((joiningDate == null) ? 0 : joiningDate.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (int) (mobileNum ^ (mobileNum >>> 32));
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + roomNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Register other = (Register) obj;
		if (Float.floatToIntBits(advancePaid) != Float.floatToIntBits(other.advancePaid))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (joiningDate == null) {
			if (other.joiningDate != null)
				return false;
		} else if (!joiningDate.equals(other.joiningDate))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobileNum != other.mobileNum)
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (roomNumber != other.roomNumber)
			return false;
		return true;
	}

}
