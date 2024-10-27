package lab5;

import javax.xml.namespace.QName;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length){
        if (length <= 0){
            throw new IllegalArgumentException("You crazy person! Length must be positive!");
        }
        else{
            this.length = length;
        }
    }

    public void setWidth(double width){
        if (width <= 0){
            throw new IllegalArgumentException("You nutjob! Width must be positive!");
        }
        else{
            this.width = width;
        }
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return (length * 2) + (width * 2);
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }


}
