package seLabsTestingPackage;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*; 



public class TestMyPoint {
	private MyPoint mpEmpty;
	private MyPoint mp;
	
	
	@Before
	public void setUp() throws Exception {
		this.mpEmpty = new MyPoint();
		this.mp = new MyPoint(5.1, 2.1);
		
	}
	@After
	public void tearDown() throws Exception {
		this.mp = null;
		this.mpEmpty = null;
	}
	@Test
	public void defaultPoint() {
		 assertEquals (0d, mpEmpty.getX(), 0.0001);
		 assertEquals (0d, mpEmpty.getY(), 0.0001);
	}
	@Test
	public void pointX5Y2() {
		 assertEquals (5.1d, mp.getX(), 0.0001);
		 assertEquals (2.1d, mp.getY(), 0.0001);
	}
	@Test
	public void getAndSetX() {
		 mp.setX(8.1);
		 assertEquals (8.1d, mp.getX(), 0.0001);
	}
	@Test
	public void getAndSetNull() {
		 double x = mp.getX();
		 double y = mp.getY();
		 mp.setX(Double.NaN);
		 mp.setY(Double.NaN);
		 assertEquals (x, mp.getX(), 0.0001);
		 assertEquals (y, mp.getY(), 0.0001);
	}
	@Test
	public void getAndSetY() {
		 mp.setY(1.3);
		 assertEquals (1.3d, mp.getY(), 0.0001);
	}
	@Test
	public void setDoubleNaN() {
		 double x = mp.getY();
		 mp.setY(Double.NaN);
		 assertEquals (x, mp.getY(), 0.0001);
	}
	@Test
	public void pointFromPointX5Y2() {
		 MyPoint fromPoint = new MyPoint(mp);
		 assertEquals (5.1d, fromPoint.getX(), 0.0001);
		 assertEquals (2.1d, fromPoint.getY(), 0.0001);
	}
	@Test
	public void pointFromPointX5Y2GetAndSetX() {
		 MyPoint fromPoint = new MyPoint(mp);
		 fromPoint.setX(8.3);
		 assertEquals (8.3d, fromPoint.getX(), 0.0001);
	}
	@Test
	public void pointFromPointX5Y2GetAndSetY() {
		 MyPoint fromPoint = new MyPoint(mp);
		 fromPoint.setY(11.3);
		 assertEquals (11.3d, fromPoint.getY(), 0.0001);
	}
	@Test
	public void scalePoint8() {
		MyPoint mpScale = mp.scale(8.0);
		assertEquals (40.8d, mpScale.getX(), 0.0001);
		assertEquals (16.8d, mpScale.getY(), 0.0001);
	}
	@Test(expected = IllegalArgumentException.class)
	public void horizontalSymmetryIllegalArgumentException() {
		mp.horizontalSymmetry(null);
	}
	@Test
	public void horizontalSymmetryException() {
		MyPoint mpHS = new MyPoint(4.6, 2.3);
		MyPoint newMp = mp.horizontalSymmetry(mpHS);
		assertEquals (4.1d, newMp.getX(), 0.0001);
		assertEquals (2.1d, newMp.getY(), 0.0001);
	}
	@Test(expected = IllegalArgumentException.class)
	public void testCentralSymmetryNULL ( ) {
	    new MyPoint ( 1.0 , 2.0 ) . centralSymmetry ( null ) ;
	}
	@Test
	public void testMockSetPoint() {
		Random rMockX = mock(Random.class);
        Random rMockY = mock(Random.class);
        when(rMockX.nextInt()).thenReturn(5);
        when(rMockY.nextInt()).thenReturn(12);
        mp.setPoint(rMockX,rMockY);
        assertEquals (5d, mp.getX(), 0.0001);
        assertEquals (12d, mp.getY(), 0.0001);
	}
	
	

	
	
	
	
}
