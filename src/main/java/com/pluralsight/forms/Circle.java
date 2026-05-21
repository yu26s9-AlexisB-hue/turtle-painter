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

        int radius;

        for(int i = 0; i < 360; i++){
            turtle.turnRight(size * 0.02);
            turtle.forward(1);
        }
    }
}
