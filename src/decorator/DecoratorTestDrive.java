package decorator;

public class DecoratorTestDrive {
	public static void main (String args[]) {
		
		MusCard m = new Summer ( new Student("Carlo", 18) );
		MusCard d = new Summer ( new Absolute ( new Student("Alberto", 25), 5.0 ) );
		
		MusCard t = new Summer ( new Tourist ("Frank", 15) );
		
		
		System.out.println("Carlo (Student + Summer) pays € " + m.getCost() );	
		System.out.println("Alberto (Student + Absolute + Summer) pays " + d.getCost() );	
		
		System.out.println("Frank (Tourist + Summer) pays € " + t.getCost() );	


		MusCard st = new Student("Carlo", 18) ;

		
		System.out.println("Carlo = Alberto ? " + m.equals(t) );
		System.out.println("Carlo = Carlo ? " + m.equals(m) );	

		System.out.println("Carlo = Frank ? " + m.equals(d) );	
		
		System.out.println("Carlo discounted = Carlo ? " + m.equals(st) );	


		MusCard carl = new Student("Carlo", 19) ;
		System.out.println("Carlo = Carlo ? " + m.equals(carl) );	

		MusCard lam = new Tourist ("Mark", 100);
		
		double res = LambdaDecorator.summer.apply( lam.getCost() );
		double perc = LambdaDecorator.perc.applyAsDouble(lam.getCost(), 0.3);

		
		System.out.println( "Mark discounted with lambdads pays " + res );
		
		System.out.println( "Mark discounted with lambdads pays " + perc );

		


	}


}
