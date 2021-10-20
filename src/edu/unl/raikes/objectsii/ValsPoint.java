package edu.unl.raikes.objectsii;

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
     * @return the x
     */
    public int getX() {
        return this.x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

	
}
