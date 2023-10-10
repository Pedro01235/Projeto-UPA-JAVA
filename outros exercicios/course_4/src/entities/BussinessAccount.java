package entities;

public class BussinessAccount extends Account {

	private Double loanlimit;

	public BussinessAccount() {
		super ();
	}

	public BussinessAccount(int number, String holder, Double balance, Double loanlimit) {
		super(number, holder, balance);
		this.loanlimit = loanlimit;
	}

	public Double getLoanlimit() {
		return loanlimit;
	}

	public void setLoanlimit(Double loanlimit) {
		this.loanlimit = loanlimit;
	}

	public void loan (double amount ) {
		if (amount <= loanlimit) {
			deposit(amount);
		}
		
	}
	
}
