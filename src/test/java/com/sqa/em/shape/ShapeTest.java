/**
 * File Name: ShapeTest.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 2, 2016
 */
package com.sqa.em.shape;

import org.junit.Test;

/**
 * ShapeTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class ShapeTest {

	/**
	 * @param args
	 */
	@Test
	public void test() {
		Shape myShape1 = new Shape();
		Shape myShape2 = new Shape("Advanced Shape", "Square", "Blue");
		System.out.println("My Shape 1: " + myShape1);
		System.out.println("My Shape 2: " + myShape2);
	}
}
