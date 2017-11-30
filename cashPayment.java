
public class cashPayment {
	
	double moneyDue;
	public cashPayment(double amount) {
		moneyDue = amount;
	}
	
	public double getOneHundred(long num) {
		moneyDue = moneyDue-100*num;
		return moneyDue;
	}
	
	public double getFifty(long num) {
		moneyDue = moneyDue - 50*num;
		return moneyDue;
	}
	
	public double getTwenty(long num) {
		moneyDue = moneyDue - 20*num;
		return moneyDue;
	}
	
	public double getTen(long num) {
		moneyDue = moneyDue - 10*num;
		return moneyDue;
	}
	
	public double getFive(long num) {
		moneyDue = moneyDue - 5*num;
		return moneyDue;

	}
	
	public double getOne(long num) {
		moneyDue = moneyDue - 1*num;
		return moneyDue;
	}
	
	public double getQuarter(long num) {
		moneyDue = moneyDue - .25*num;
		return moneyDue;
	}
	
	public double getDime(long num) {
		moneyDue = moneyDue - .1*num;
		return moneyDue;
	}
	
	public double getNickel(long num) {
		moneyDue = moneyDue - .05*num;
		return moneyDue;
	}
	
	public double getPenny(long num) {
		moneyDue = moneyDue - .01*num;
		return moneyDue;
	}
	
	public double getAmount() {
		return moneyDue;
	}
	
	
}
