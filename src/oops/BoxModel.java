package oops;

public class BoxModel {
    private int height;
    private int width;
    private int length;
    private String color;

    /*
    Constructors
    special method to initalize a memeber of a class
    name is same as class name
    no reutrn type

    no params is default constructor
     */
    public BoxModel(){
        this.height = 2;
    }

    public BoxModel(int height, int width, int length, String color) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }
}
