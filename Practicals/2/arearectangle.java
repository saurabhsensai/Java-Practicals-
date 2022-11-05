import java.util.Scanner;
public class arearectangle {
    



        int a;
        int b;
    
        void getdata(){
            System.out.println("Enter Length and Breadth of rectangle");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       b = sc.nextInt();
     
        }
    
        void display(){
          
        System.out.println("The area of rectangle is  "+a*b);
    
        }
    
    
        public static void main(String args[]){
    
    
    
            arearectangle a = new arearectangle();
            a.getdata();
            a.display();
    
        }
    }    

