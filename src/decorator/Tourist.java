package decorator;

public class Tourist implements DisCard {
	private String name;
	private double dayCost;

	public Tourist (  String name, double dayCost ) {
		this.name = name;
		this.dayCost = dayCost;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return dayCost;
	}


	public boolean equals(Object m) {

		if ( this == m ) return true;

		if ( m == null) return false;

		if ( m instanceof Tourist ) {
			Tourist d = (Tourist)m;
			return name.equals(d.getName());
		}
		else if ( m instanceof DisCard ) {
			if ( m instanceof Student ) {
				return false;
			}
			else {
				DisCard d = (DisCard)m;
				return d.equals(this);
			}
		}

		return false;	

	}


}
