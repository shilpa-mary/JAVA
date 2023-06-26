import java.util.Scanner;
class sports{
    String sport;
    int Rating;
    sports(String spo, int ra){
        sport = spo;
        Rating = ra;
    }
}
class student extends sports{
    String Name;
    String Grade;
    double Overall_per;
    student(String nme, String spo, int ra,String gd, double per ){
        super(spo, ra);
        Name=nme;
        Grade = gd;
        Overall_per = per;
    }
}
public class result extends student {
    result(String nme, String spo, int ra,String gd, double per ){
        super(nme, spo, ra, gd, per);
    }
    void display(){
        System.out.println("***Sports & Academic Details of Student:***");
        System.out.println("\nName of Student:"+Name);
        System.out.println("Sport :"+sport);
        System.out.println("Rating :"+Rating);
        System.out.println("Academic Grade :"+Grade);
        System.out.println("Overall percentage :"+Overall_per+"%");
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Name of Student:");
        String nm =sc.next();
        System.out.println("Enter the Sports Details of Student");
        System.out.println("Sport: ");
        String a =sc.next();
        System.out.println("Sport Rating  out of 10: ");
        int b =sc.nextInt();
        System.out.println("Enter the Academic Details of Student");
        System.out.println("Academic Grade: ");
        String c =sc.next();
        System.out.println("Overall percentage: ");
        double d =sc.nextDouble();
        sc.close();
        result obj= new result(nm,a,b,c,d);
        obj.display();
    }
