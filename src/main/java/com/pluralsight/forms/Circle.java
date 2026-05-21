package com.pluralsight.forms;

import java.awt.*;

public class Circle extends Shapes{
    private int size;

    public Circle(Turtle turtle, Point location, Color color, int border, int size) {
        super(turtle, location, color, border);
        this.size = size;
    }

    @Override
    public void paint(){
        turtle.penUp();
        turtle.goTo(location.getX(), location.getY());
        turtle.penDown();

        double spin = (.1 * size);

        for(int i = 0; i < spin; i++){
            turtle.turnRight(10);
            turtle.forward(10);
        }
    }
}
