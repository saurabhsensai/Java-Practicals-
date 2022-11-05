import java.util.Scanner;

public class armstrong {

  
   
public static void main(String args[])   
{  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no");
    int n = sc.nextInt();
    int length = String.valueOf(n).length();
    int replica =0;
    int  r =0,temp;
    temp = n;

    while(n> 0 ){
        r = n%10;
        replica += Math.pow(r, length) ;
        n = n/10;

    }

    if(temp==replica){
        System.out.println("The no is Armstrong Number");
    }else{
        System.out.println("The no is not Armstrong Number");

        
    }
    



  
}
    
}
