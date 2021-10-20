package edu.unl.raikes.objectsii;

/**
 * Represents the data and behaviors of a point on a 2d Cartesian plane.
 * @author valentine
 *
 */
public class ValsPoint {
    private int x = 45;
    private int y = 9385;

    // Constructs a Point at the given x/y location.
    public ValsPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructs a new point at (0, 0).
    public ValsPoint() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Returns the internal state variable representing the y coordinate.
     * @return the x
     */
    public int getX() {
        return this.x;
    }

    /**
     * Change the internal state variable representing the x coordinate.
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Retrieves the internal state variable representing the y coordinate.
* @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * Change the internal state variable representing the y coordinate.
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

}
