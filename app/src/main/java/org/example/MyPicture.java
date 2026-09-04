package org.example;

/**
 * MyPicture.java
 * --------------
 * Write the code to draw your scene here. Most of your changes should go inside
 * the drawPicture method below, unless you're defining additional methods or
 * variables to help organize your code.
 *
 * If you want to enhance the functionality of the drawing library itself (e.g. add
 * a new shape function), put that in SimpleGraphics.java instead.
 */
public class MyPicture {

    public static void drawPicture(double width, double height) {
        // Fill the background
        SimpleGraphics.fillBackground("#87CEEB");

        // Draw head
        SimpleGraphics.setFillColor("#f1c27d");
        SimpleGraphics.fillCircle(250, 30, 30);

        // Draw eyes
        SimpleGraphics.setFillColor("black");
        SimpleGraphics.fillCircle(240, 20, 5);
        SimpleGraphics.fillCircle(260, 20, 5);

        // Draw Cape
        SimpleGraphics.setFillColor("red");
        //SimpleGraphics.fillParallelogram(325, 60, 150, 150);
        //SimpleGraphics.setOutlineColor("white");
        /*
        *Code for generating flowing cape written by Mr.Reidak
        */
        SimpleGraphics.setLineThickness(1);
        SimpleGraphics.flowingCape(175, 60, 150, 150, 1.2, 4, "#CB0000");

        // Draw Body
        SimpleGraphics.setFillColor("blue");
        SimpleGraphics.fillRectangle(175, 60, 150, 150);

        // Draw Superman emblem
        SimpleGraphics.superEmblem(250, 120, 100, 75, "#FFFF00", "#FF0000");

        // Draw Legs
        SimpleGraphics.setFillColor("blue");
        SimpleGraphics.fillRectangle(175, 210, 50, 100); 
        SimpleGraphics.fillRectangle(275, 210, 50, 100);

        // Draw Pants
        SimpleGraphics.setFillColor("#CB0000");
        SimpleGraphics.fillTriangle(175, 210, 325, 210, 250, 240);

        // Draw a red sun
        // SimpleGraphics.setFillColor("red");
        // SimpleGraphics.fillCircle(450, 50, 50);

        // Draw a mountain with gray triangles
        // SimpleGraphics.setFillColor("#827e7e"); // relatively dark gray
        // SimpleGraphics.fillTriangle(300, 150, 400, 20, 350, 150);
        // SimpleGraphics.setFillColor("#c7c1c1"); // lighter gray
        // SimpleGraphics.fillTriangle(350, 150, 400, 20, 550, 150);

        // Draw the horizon
        // SimpleGraphics.setOutlineColor("black");
        // SimpleGraphics.setLineThickness(1);
        // SimpleGraphics.drawLine(0, 150, 600, 150);

        // Define the points the curve should bend through
        // List<double[]> riverPoints = List.of(
        //     new double[]{100, 150}, // Start point
        //     new double[]{300, 200}, // Bends towards here
        //     new double[]{200, 350}, // Bends back here
        //     new double[]{500, 500}  // End point
        // );

        // SimpleGraphics.setOutlineColor("blue");
        // SimpleGraphics.setLineThickness(8);
        // SimpleGraphics.drawSmoothCurve(riverPoints);
    }

    public static void main(String[] args) {
        // Launch the window; only edit the starting canvas dimensions if you'd like to.
        SimpleGraphics.start(MyPicture::drawPicture, 600, 400);
    }
}
