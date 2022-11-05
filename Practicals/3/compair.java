
import java.util.Scanner; 
public class compair {
   
    
    private String name; 
    private int day;
    private String month;

    compair(String n,int d, String m){
     name = n;
     day = d;
     month = m; 
    }


    void issamemonth(compair c1){
        if(month  == c1.month){
            System.out.println("The values of months are same");
           
        }
    }

    public static void main(String args[]){
        compair[] cmp = new compair [2];
 
for (int i = 1 ; i < 3; i++)
{
   
    

      
         
        System.out.println("Enter name");
        String name = sc.nextLine();  
        
        System.out.println("Enter day");
        int day = sc.nextInt();  
         sc.nextLine();
        System.out.println("Enter month");
        String m = sc.nextLine();  

        compair n1 = new compair(name,day,m);

}
        
        n1.cmp(n2);



       


    }
}
