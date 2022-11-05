import java.util.*;
public class bankbalance {
  static int balance = 500;

  void Deposit(int i){

    balance = balance+ i;

    System.out.println("Your balance is = "+ balance);
  }


  void Withdraw(int i){
    if((balance-i) < 200){
    System.out.println("Minimum balance required id 200");
  }else{
    balance = balance -i;
    System.out.println("Your balance is "+ balance);
  }
  }




    public static void main(String args[]){
     
        bankbalance child = new bankbalance();

        child.Deposit(400);

        bankbalance parent = new bankbalance();

        parent.Withdraw(300);

        bankbalance sister = new bankbalance();

        sister.Withdraw(600);
        

    }
}
