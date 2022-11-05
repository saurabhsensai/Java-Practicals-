import java.util.Scanner;
public class ternary {
   
public static void main(String args[])   
{  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First no");
    int a  = sc.nextInt();

    System.out.println("Enter Second no");
    int b  = sc.nextInt();

    System.out.println("Enter Third no");
    int c  = sc.nextInt();

    int large = (a >= b ) ? ((a > c) ? a : c) : ((b > c) ? b : c);

    System.out.println("Largest no is "+ large);



}  
 
}
