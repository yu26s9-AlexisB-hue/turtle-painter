package com.pluralsight.forms;

import java.awt.*;

public class MainApp
{
    public static void main(String[] args) {
        int width = Console.promptForInt("World Width: ");
        int height = Console.promptForInt("World Height: ");

        World world = new World(width, height);
        Turtle turtle = new Turtle(world);

        boolean running = true;

        while(running){

            String prompt = """
                    1 - Add Shape
                    2 - Save Image
                    0 - Exit
                    """;

            //Takes and returns the users input into the command.
            int command = Console.promptForInt(prompt);

            switch (command){

                case 1:
                    Shapes shape = drawShapes(turtle);
                    shape.paint();
                    break;

                case 0:
                    running = false;
                    break;

            }
        }
    }

    private static Shapes drawShapes(Turtle turtle){
        String prompt = """
                1 - Square
                2 - Triangle
                3 - Circle
                """;
        int choice = Console.promptForInt(prompt);
        Color color = Console.promptForColor("Color for turtle: ");
        int border = Console.promptForInt("Border width: ");
        int x = Console.promptForInt("Enter x: ");
        int y = Console.promptForInt("Enter y: ");
        int size = Console.promptForInt("How big do you want your shape: ");

        Point location = new Point(x,y);

        turtle.setPenWidth(border);
        turtle.setColor(color);


        Shapes shape = null;
        //todo:How to make the color to be promptable.
        switch (choice){
            case 1:
                shape = new Square(turtle,location,color,border,size);
                break;

            case 2:
                shape = new Triangle(turtle,location,color,border,size);
                break;

            case 3:
                shape = new Circle(turtle,location,color,border,size);
                break;

            default:
                System.out.println("Invalid Entry.");

        }


        return shape;

    }
}