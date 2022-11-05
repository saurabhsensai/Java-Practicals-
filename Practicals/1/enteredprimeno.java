import javax.swing.text.html.StyleSheet;

import java.util.Scanner;
public class enteredprimeno {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The no To check");
        int x = sc.nextInt();
          int flag = 0;

        for(int i =2 ; i < x;i++ ) {
            if(%i==0){
                flag = 1;
                break;
            }

        }

        if(flag==0){
            System.out.println("The Given no is Prime no");
        }else{
            System.out.println("The given no is not a prime no");
        }


    }
    
}
