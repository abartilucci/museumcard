package decorator;

public class Summer implements Sale {
	DisCard dCard;

	public Summer (DisCard dCard) {
		this.dCard = dCard;
	}

	public double getCost() {
		return dCard.getCost() * 0.80;
	}

	public String getName() {
		return dCard.getName();
	}

	public boolean equals(Object m) {
		return dCard.equals(m);
	}

}
