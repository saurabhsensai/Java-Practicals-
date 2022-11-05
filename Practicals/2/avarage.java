import java.util.Scanner;


class avarage{
    int a;
    int b;int c;

    void getdata(){
        System.out.println("Enter three nos for an avarage");
   Scanner sc = new Scanner(System.in);
   a = sc.nextInt();
   b = sc.nextInt();
   c = sc.nextInt();
    }

    void display(){
      
    System.out.println("The Avarage of The three nos is "+(a+b+c)/3 );

    }


    public static void main(String args[]){



        avarage ag = new avarage();
        ag.getdata();
        ag.display();

    }
}