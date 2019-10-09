package decorator;

public class Percentage implements Sale {
	DisCard dCard;
	private double percentage;

	public Percentage (DisCard dCard, double percentage) {
		this.dCard = dCard;
		this.percentage = percentage;
	}

	public double getCost() {
		return dCard.getCost() - ( (dCard.getCost()*percentage)/100 ) ;
	}


	public double getPercentage() {
		return percentage;
	}

	public String getName() {
		return dCard.getName();
	}

	public boolean equals(Object m) {
		return dCard.equals(m);

	}


}
