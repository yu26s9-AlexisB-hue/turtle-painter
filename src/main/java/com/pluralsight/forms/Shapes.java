package com.pluralsight.forms;


import java.awt.*;

public abstract class Shapes {
    protected Turtle turtle;
    protected Point location;
    protected Color color;
    protected int border;

    public Shapes(Turtle turtle, Point location, Color color, int border) {
        this.turtle = turtle;
        this.location = location;
        this.color = color;
        this.border = border;
    }

    public abstract void paint();
}
