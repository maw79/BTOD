
public class CCPayment {
	String name, CCNum, CVV, zip, type;
	double total;
	
	public CCPayment(String name, String CCNum, String CVV, String zip, String type, double total) {
		this.name = name;
		this.CCNum = CCNum;
		this.CVV = CVV;
		this.zip = zip;
		this.type = type;
		this.total = total;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCCNum() {
		return CCNum;
	}
	
	public String getCVV() {
		return CVV;
	}
	
	public String getZip() {
		return zip;
	}
	
	public String getType() {
		return type;
	}
	
	public double getTotal() {
		return total;
	}
}
