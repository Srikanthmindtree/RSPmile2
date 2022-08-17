package Employee.Menudriven;

public class customer {
	private int cusid;
	private String cusname;
	private int cusage;
	private int puramount;
	public customer(int cusid, String cusname, int cusage, int puramount) {
		super();
		this.cusid = cusid;
		this.cusname = cusname;
		this.cusage = cusage;
		this.puramount = puramount;
	}
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public int getCusage() {
		return cusage;
	}
	public void setCusage(int cusage) {
		this.cusage = cusage;
	}
	public int getPuramount() {
		return puramount;
	}
	public void setPuramount(int puramount) {
		this.puramount = puramount;
	}
	@Override
	public String toString() {
		return "customer [cusid=" + cusid + ", cusname=" + cusname + ", cusage=" + cusage + ", puramount=" + puramount
				+ "]";
	}
	
	

}
