package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;


import decorator.Absolute;
import decorator.MusCard;
import decorator.Tourist;
import decorator.Student;
import decorator.Summer;
import decorator.LambdaDecorator;

public class saleTest {
	private MusCard m;
	private MusCard d;
	private MusCard lam;
	private MusCard loop;


	@Before
	public void setUp() {
		m = new Summer ( new Tourist ("John", 10));
		d = new Summer ( new Absolute ( new Student("Alberto", 25), 5.0 ) );
		lam = new Tourist ("Mark", 40);
		loop = new Summer ( new Summer ( new Absolute ( new Student("Alberto", 25), 5.0 ) ) );
		
	}

	@Test
	// Test Summer Promo on discountable type of cards
	public void summer() {
		double res = m.getCost();
		Assert.assertEquals(res, 8, 0.0001);
	}

	@Test
	// Test Summer Promo with a combined Absolute discount
	public void summerCombined() {
		double result = d.getCost();	
		Assert.assertEquals(result, 16, 0.0001);
	}
	
	@Test
	// Test Summer Promo with a combined Absolute discount
	public void summerLoop() {
		double result = loop.getCost();	
		Assert.assertEquals(result, 12.8, 0.0001);
	}


	@Test
	// Test summer with lambda expr
	public void lambdaSum() {
		double res = LambdaDecorator.summer.apply(lam.getCost());		
		Assert.assertEquals(res, 32, 0.0001);

	}
	
	@Test
	// Test Percentage promo with lambda expr
	public void lambdaPer() {
		double res = LambdaDecorator.perc.applyAsDouble(lam.getCost(), 0.3);
		Assert.assertEquals(res, 28, 0.0001);

	}
	
	@Test
	// Test Absolute promo with lambda expr
	public void lambdaAbs() {
		double res = LambdaDecorator.absolute.applyAsDouble(lam.getCost(), 15.0);
		Assert.assertEquals(res, 25, 0.0001);

	}


}
