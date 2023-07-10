import java.util.Scanner;

interface prop
{
    void getdata();
    void area();
    void perimeter();
}

class Circle implements prop
{
    double pi = 3.14;
    double r;
    Scanner sc = new Scanner(System.in);
    @Override
    public void getdata()
    {
        System.out.println("Enter the radius of the circle:");
        r = sc.nextDouble();
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter  of the circle: "+(2*pi*r));
    }
    @Override
    public void area()
    {
        System.out.println("Area of the circle: "+(pi*r*r));
    }
}

class Rectangle implements prop
{
    double l,b;
    Scanner sc = new Scanner(System.in);
    @Override
    public void getdata()
    {
        System.out.println("Enter the length of the rectangle:");
        l = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        b = sc.nextDouble();
    }
    @Override
    public void area()
    {
        System.out.println("Area of a rectangle: "+(l*b));
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter of a rectangle: "+(2*(l+b)));
    }
}

class Square implements prop
{
    double side;
    Scanner sc = new Scanner(System.in);
    @Override
    public void getdata()
    {
        System.out.println("Enter the side of the square:");
       side = sc.nextDouble();
    }
    @Override
    public void area()
    {
        System.out.println(" Area of a Square: "+(side*side));
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter of a Square: "+(4*side));
    }
}

public class Shapes 
{
    public static void main(String[] args) 
    {
        int ch;
        Scanner sc = new Scanner(System.in);
        Circle ob = new Circle();
        Rectangle obj = new Rectangle();
	Square ob1 = new Square();
        do
        {
            System.out.println("\n1.Circle\n2.Rectangle\n3.Square\n4.exit");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1 :ob.getdata();
                        ob.area();
                        ob.perimeter();
                        break;
                case 2 :obj.getdata();
                        obj.area();
                        obj.perimeter();
                        break;
	               case 3 :ob1.getdata();
                        ob1.area();
                        ob1.perimeter();
                        break;
                case 4 :System.out.println("Exited...");
                        System.exit(0);
            }
        }while(true);
    }
}
