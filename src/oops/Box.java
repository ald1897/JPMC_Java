package oops;

public class Box {
    // data members
    private int height;
    private int width;
    private int length;
    private double volume;

    // reusability => methods
    // <access_specifier> <returntype> <methodName>() {}

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double calcVolume() {
        this.volume = this.height*this.width*this.length;
        return this.volume;
    }

    public void setDimensions() {
        this.height = 2*10;
        this.width = 2*10;
        this.length = 2*10;
    }

    public void setDimensions(int h, int w, int l) {
        this.height = h*10;
        this.width = w*10;
        this.length = l*10;
    }

}
