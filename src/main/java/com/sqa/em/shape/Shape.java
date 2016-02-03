/**
 * File Name: ShapeClassIntro.java<br>
 * Mora, Eduardo<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Feb 2, 2016
 */
package com.sqa.em.shape;

/**
 * ShapeClassIntro //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Mora, Eduardo
 * @version 1.0.0
 * @since 1.0
 */
public class Shape {

	private String name;

	private String type;

	private String color;

	private int numSides;

	private boolean ellipsis;

	private boolean polygon;

	private boolean square;

	/**
     * @param name
     * @param type
     * @param color
     */
    public Shape() {
        this.name = "My Shape";
        this.type = "Shape";
        this.color = "white";
    }

	/**
     * @param name
     * @param type
     * @param color
     */
    public Shape(String name, String type, String color) {
        this.name = name;
        this.type = type;
        this.color = color;
    }

	/**
	 * @return the color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the numSides
	 */
	public int getNumSides() {
		return this.numSides;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * @return the eclipse
	 */
	public boolean isEllipsis() {
		return this.ellipsis;
	}

	/**
	 * @return the polygon
	 */
	public boolean isPolygon() {
		return this.polygon;
	}

	/**
	 * @return the square
	 */
	public boolean isSquare() {
		return this.square;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param eclipse
	 *            the eclipse to set
	 */
	public void setEllipsis(boolean eclipse) {
		this.ellipsis = eclipse;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param numSides
	 *            the numSides to set
	 */
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}

	/**
	 * @param polygon
	 *            the polygon to set
	 */
	public void setPolygon(boolean polygon) {
		this.polygon = polygon;
	}

	/**
	 * @param square
	 *            the square to set
	 */
	public void setSquare(boolean square) {
		this.square = square;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
}
