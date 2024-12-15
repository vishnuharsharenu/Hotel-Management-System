package entity;

public class Customer {

	private String cname;
	private int cid;
	private long phno;
	private String email;
	private Address caddress;
	private double camt;
	
	//create getter & setter
	public double getCamt() {
		return camt;
	}
	public void setCamt(double Camt) {
		this.camt=camt;
	}
	
	public Customer(String cname, int cid, long phno, String email, Address caddress) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.phno = phno;
		this.email = email;
		this.caddress = caddress;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getCaddress() {
		return caddress;
	}

	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", phno=" + phno + ", email=" + email + ", caddress="
				+ caddress + "]";
	}
}
