// *****************************************************************
// Average.java
//
// Read three integers from the user and print their average
// *****************************************************************
import java.util.Scanner;
public class Average {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int Val1, Val2, Val3 ;
        double Average;
        
        Scanner scan = new Scanner(System.in);
        
     // get three values from user
        System.out.println("Please enter three integers and " +
        "I will compute their average");
         Val1 = scan.nextInt();
         Val2 = scan.nextInt();
         Val3 = scan.nextInt();
       //compute the average   
         Average = (Val1 + Val2 + Val3) / 3;
       //print the average  
         System.out.println("Average of three int is"+Average);
         
         
         int a = 3, b = 10, c = 7;
         double w = 12.9, y = 3.2;
         System.out.println("a + b * c=");
         System.out.println("a - b - c=");
         System.out.println("a/b=");
         System.out.println("b/a=");
         System.out.println("a-b/c=");
         System.out.println("w/y=");
         System.out.println("y/w=");
         System.out.println("a + w / b=");
         System.out.println("a % b / y=");
         System.out.println("b % a=");
         System.out.println("w % y=");
         
         scan.close();
         
       

    }

}
