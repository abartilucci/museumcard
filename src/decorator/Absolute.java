package decorator;

public class Absolute implements Sale {
	DisCard dCard;
	private double sale;

	public Absolute (DisCard dCard, double sale) {
		this.dCard = dCard;
		this.sale = sale;
	}

	
	public String getName() {
		return dCard.getName();
	}

	public double getCost() {
		double baseCost = dCard.getCost();
		if ( baseCost - sale < 0 )
			return 0.0;
		else
			return baseCost - sale ;
	}

	public double getSale() {
		return sale;
	}
	
	public boolean equals(Object m) {
		return dCard.equals(m);
	} 

}
