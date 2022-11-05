import java.util.Scanner;

public class palindrome {

  
   
public static void main(String args[])   
{  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no");
    int n = sc.nextInt();

    int replica =0;
    int  r =0,temp;
    temp = n;

    while(n> 0 ){
        r = n%10;
        replica = (replica*10)+r;
        n = n/10;

    }

    if(temp==replica){
        System.out.println("The no is Palindrome");
    }else{
        System.out.println("The no is not palindrome");

        
    }
    



  
}
    
}
