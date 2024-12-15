package entity;

public class Address {

	private int h_no;
	private String street;
	private int pincode;
	private String dist;
	private String state;
	
	public Address(int h_no, String street, int pincode, String dist, String state) {
		super();
		this.h_no = h_no;
		this.street = street;
		this.pincode = pincode;
		this.dist = dist;
		this.state = state;
	}
	public int getH_no() {
		return h_no;
	}
	public void setH_no(int h_no) {
		this.h_no = h_no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [h_no=" + h_no + ", street=" + street + ", pincode=" + pincode + ", dist=" + dist + ", state="
				+ state + "]";
	}
	
}
