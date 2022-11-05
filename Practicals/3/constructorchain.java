public class constructorchain {

    constructorchain(){
       System.out.println("This is First Constructor");;
    }

    constructorchain(int num1,int num2 , int num3){
        this();
        System.out.println("The first no is " + (num1+num2+num3));
    }

    constructorchain(int num1, int num2){
        this(45,56,67);
        System.out.println("The multiplication is " + num1* num2);
    }
    public static void main(String args[]){
        constructorchain n = new constructorchain(2,4);
    }
}
