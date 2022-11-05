class defaultc{
  

    defaultc(){
        System.out.println("Hello This is default Constructor");
    }

    defaultc(int a , int b){
        System.out.println("The addition of two no is " + a+b);
    }
    public static void main(String args[]){


        defaultc d = new defaultc();
        defaultc e = new defaultc(1,2);








    }
}