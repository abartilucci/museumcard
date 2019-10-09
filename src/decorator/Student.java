package decorator;

public class Student implements DisCard {
	private String name;
	private double monthCost;
	

	public Student (  String name, double monthCost ) {
		this.name = name;
		this.monthCost = monthCost;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return monthCost;
	}


	public boolean equals(Object m) {
		
		if ( this == m ) return true;
		
		if ( m == null) return false;
		
		if ( m instanceof Student ) {
			Student d = (Student)m;
			return name.equals(d.getName());
		}
		
		else if ( m instanceof DisCard ) {
			if ( m instanceof Tourist ) {
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
