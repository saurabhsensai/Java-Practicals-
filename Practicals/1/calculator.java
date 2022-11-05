import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a , b;
       while(true){
      System.out.println("Enter thr Choice You want");
      System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division \n 5.EXIT");
      int choice = sc.nextInt();
       switch(choice){
        case 1: 
        System.out.print("Enter first number- ");  
        a= sc.nextInt(); 
        System.out.print("Enter second number- ");  
         b= sc.nextInt(); 
        System.out.println("Addition = "+(a+b)+"\n");
        break;
        case 2:
        System.out.print("Enter first number- ");  
        a= sc.nextInt(); 
        System.out.print("Enter second number- ");  
         b= sc.nextInt(); 
        System.out.println("Subtraction= "+(a-b)+"\n");        break;
        case 3:
        System.out.print("Enter first number- ");  
        a= sc.nextInt(); 
        System.out.print("Enter second number- ");  
         b= sc.nextInt(); 
        System.out.println("Multiplication= "+(a*b)+"\n");
        break;
        case 4:
        System.out.print("Enter first number- ");  
        a= sc.nextInt(); 
        System.out.print("Enter second number- ");  
         b= sc.nextInt(); 
        System.out.println("Division = "+(a/b)+"\n");        break;
        
        case 5:
        System.exit(1);
        break;
       }
    }
    }
}
