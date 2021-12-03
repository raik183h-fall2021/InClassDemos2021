package edu.unl.raikes.sortingII;

import org.w3c.dom.css.RGBColor;

public class JellyBeans {
    private double size;
    private RGBColor color;
    private String flavor;
    private String brand;

    public JellyBeans(double size, RGBColor color, String flavor, String brand) {
        super();
        this.size = size;
        this.color = color;
        this.flavor = flavor;
        this.brand = brand;
    }

    /**
     * Returns the size that belongs to the JellyBeans class.
     *
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * Allows a user of this class to set a JellyBeans object's size.
     *
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Returns the color that belongs to the JellyBeans class.
     *
     * @return the color
     */
    public RGBColor getColor() {
        return color;
    }

    /**
     * Allows a user of this class to set a JellyBeans object's color.
     *
     * @param color the color to set
     */
    public void setColor(RGBColor color) {
        this.color = color;
    }

    /**
     * Returns the flavor that belongs to the JellyBeans class.
     *
     * @return the flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * Allows a user of this class to set a JellyBeans object's flavor.
     *
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * Returns the brand that belongs to the JellyBeans class.
     *
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Allows a user of this class to set a JellyBeans object's brand.
     *
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "JellyBeans [size=" + size + ", color=" + color + ", flavor=" + flavor + ", brand=" + brand + "]";
    }
    
    

}
