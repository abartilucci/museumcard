package decorator;

public class Business implements MusCard {
	private int code;
	private double annualCost;

	public Business ( int code, double annualCost) {
		this.code = code;
		this.annualCost = annualCost;
	}

	public int getCode() {
		return code;
	}
	
	public double getCost() {
		return annualCost;
	}

	public boolean equals(Object m) {
		
		if ( this == m)	return true;

		if ( m == null) return false;

		if (getClass() != m.getClass() )	return false;

		Business t = (Business)m;
		return code == t.getCode();
	}	

}
