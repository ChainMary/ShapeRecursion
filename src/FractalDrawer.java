// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea = 0;  // member variable for tracking the total area

    public FractalDrawer() {}  // constructor


    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas = new Canvas(800,800);
        if (type.equals("circle"))
            drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level);

        else if(type.equals("triangle")){
            drawTriangleFractal(double width,double height,double x,double  y, Color c, Canvas can,  int level);
        }
        else if(type.equals("rectangle"))
            drawRectangleFractal( double width,double  height,double x,double y, Color c, Canvas can,int level);

        return type.calculateArea(type);
    }


    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        int area = 0;
        if (double width == 0)
            return area;
        else{
            for (int i = 0; i < 10; i++) {
                drawing.drawShape(type);
                drawTriangleFractal( width/2,height/2, x, y, c, can,level);
                area += type.calculateArea(width, height);
            }
        }
    }


    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        for (int i = 0; i<10; i++){
            int area = 0;
            if (radius == 0)
                return area;
            else{
                drawing.drawShape(type);
                drawCircleFractal(radius/2, x,y,  c,  can,  level);
                area += type.calculateArea(radius);
            }
    }


    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        for (int i = 0; i<10; i++){
            for (int i = 0; i<10; i++){
                int area = 0;
                if (width== 0)
                    return area;
                else{
                    drawing.drawShape(type);
                    drawRectangleFractal( width/2, height/2, x,  y,c, can, level);
                    area += type.calculateArea(width,height);
        }
    }

    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        Circle myCircle = new Circle(radius/2, x,y);
        Triangle myTri = new Triangle(double x,double y,height, width);
        Rectangle myRec = new Rectangle(x,y,height,width);
        System.out.println("Enter the shape you want: ");
        Scanner myScanner = new Scanner(System.in);
        String userShape = myScanner.nextLine();
        drawFractal(userShape);

        System.out.println("The area is: " + drawFractal(userShape));


    }
}
