package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import decorator.Business;
import decorator.MusCard;
import decorator.Student;
import decorator.Summer;
import decorator.Tourist;

public class eqTest {
	private MusCard st;
	private MusCard to;
	private MusCard biz;
	private MusCard decS; 
	private MusCard decT; 


	@Before
	public void setUp() {
		st = new Student("Carlo", 65);
		to = new Tourist("Frank", 4.20);
		biz = new Business(159134, 1250.00);
		decS = new Summer ( new Student ("Carlo", 70 ));
		decT = new Summer ( new Tourist ("Frank", (int)(Math.random()*8)) );
	}


	@Test	
	// Testing Student with Tourist
	public void test_StudentTour() {
		boolean result = st.equals(to);
		Assert.assertFalse(result);
	}	

	@Test	
	// Testing different Student with Business
	public void test_StudentBiz() {
		boolean result = st.equals(biz);
		Assert.assertFalse(result);
	}

	@Test	
	// Testing Tourist with Student
	public void test_TourStud() {
		boolean result = to.equals(st);
		Assert.assertFalse(result);
	}

	@Test	
	// Testing Tourist with Business
	public void test_TourBiz() {
		boolean result = to.equals(biz);
		Assert.assertFalse(result);
	}

	@Test	
	// Testing Business with Student
	public void test_BizStud() {
		boolean result = biz.equals(st);
		Assert.assertFalse(result);
	}

	@Test	
	// Testing Business with Tourist
	public void test_BizTour() {
		boolean result = biz.equals(to);
		Assert.assertFalse(result);
	}


	@Test
	// Testing two identical Student
	public void test_SameStud() {
		boolean result = st.equals(st);
		Assert.assertTrue(result);
	}

	@Test
	// Testing two identical Tourist
	public void test_SameTour() {
		boolean result = to.equals(to);
		Assert.assertTrue(result);
	}

	@Test
	// Testing two identical Business
	public void test_SameBiz() {
		boolean result = biz.equals(biz);
		Assert.assertTrue(result);
	}

	@Test
	// Testing decorated student with non decorated same-name student
	public void testOwner_Stud() {
		boolean res = decS.equals(st);
		Assert.assertTrue(res);
	}

	@Test
	// Testing decorated tourist with non decorated same-name tourist
	public void testOwner_Tour() {
		boolean res = decT.equals(to);
		Assert.assertTrue(res);
	}


	@Test
	// Testing decorated student with decorated tourist
	public void testDecorated() {
		boolean res = decS.equals(decT);
		Assert.assertFalse(res);

	}


}
