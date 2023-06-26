import java.util.Scanner;
class Publisher{
    String publisher;
    Publisher(String pub){
        this.publisher=pub;
    }
}
class Book extends Publisher{
    String book;
    Book(String boo,String pub){
        super(pub);
        book=boo;

    }
}
class Literature extends Book{
    String category;
    Literature(String boo, String pub){
        super(boo , pub);
    }
    void display(){
        System.out.print("Book :"+book);
        System.out.println("\nPublisher :"+publisher);
    }
}
class Fiction extends Book{
    Fiction(String boo, String pub){
        super(boo , pub);
    }
    void display(){
        System.out.print("Book :"+book);
	System.out.println("\nPublisher :"+publisher);
    }
}
public class bookDetails{
    public static void main(String[] args) {
        System.out.println("Enter the No. of Literature Books:");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        Literature arr[]=new Literature[num];
        System.out.println("Enter the Literature Book Details");
        int x = 0,j=0;
        Scanner sc =new Scanner(System.in);
        for(int i =0;i<num;i++)
        {
            x = i +1;
            System.out.println(x+").");
            System.out.print("Book : ");
            String boo=sc.nextLine();
            System.out.println("Publisher: ");
            String pub=sc.nextLine();
        
            arr[i]=new Literature(boo,pub);
        }
        System.out.println("Enter the No. of Fiction Books:");
        int num1 = sc1.nextInt();
        Fiction arr1[]=new Fiction[num1];
        System.out.println("Enter the Fiction Book Details");
        int x1 = 0,j1=0;
        for(int i =0;i<num1;i++)
        {
            x1 = i +1;
            System.out.println(x1+").");
            System.out.print("Book : ");
            String boo=sc.nextLine();
            System.out.println("Publisher: ");
            String pub=sc.nextLine();
        
            arr1[i]=new Fiction(boo,pub);
        }
        sc.close();
        sc1.close();

        System.out.println("****Informations of all the Literature Books****");
        for(int i=0;i<num;i++){
            j=i+1;
            System.out.println(j+").");
            arr[i].display();
            
        }
        System.out.println("****Informations of all the Fiction Books****");
        for(int i=0;i<num1;i++){
            j1=i+1;
            System.out.println(j1+").");
            arr1[i].display();
            
        }
     sc1.close();
     }
    
    }
