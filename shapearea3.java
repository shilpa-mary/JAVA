import java.io.*;
import java.util.Scanner;
 
class Shape {
 
    static final double PI = 3.14;
    void Area(float s)
    {
        float A = s * s;
        System.out.println("Area of the Square: " + A);
    }
 
   
    void Area(double r)
    {
        double A = PI * r * r;
        System.out.println("Area of the Circle: " + A);
    }
 
    
    void Area(int l, int b)
    {
        int A = l * b;
        System.out.println("Area of the Rectangle: " + A);
    }
}
 
class shapearea {
 
    
    public static void main(String[] args)
    {
 
       
        Shape obj = new Shape();
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the side of the Square: ");
        float s=n.nextInt();
        System.out.println("Enter the radius of the Circle: "); 
        double r=n.nextInt();
        System.out.println("Enter the length of the Rectangle: ");
	int l=n.nextInt();
        System.out.println("Enter the breadth of the Rectangle: ");
	int b=n.nextInt();
        obj.Area(s);
        obj.Area(r);
        obj.Area(l,b);
    }
}
