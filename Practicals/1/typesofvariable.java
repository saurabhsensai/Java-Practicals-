public class typesofvariable {
    static int sta = 20;
    int inst;

    void display(){
        int i = 10;
       System.out.println("The value of local variable is "+ i);     
    }
    public static void main(String args[]){
       

    typesofvariable a = new typesofvariable();
    typesofvariable b = new typesofvariable();
    a.display();
    a.inst= 40;
    System.out.println("First Instance variable "+a.inst);
    System.out.println("Static variable "+sta);
    b.inst = 50;
    System.out.println("Second Instance variable "+ b.inst);
    System.out.println("Static variable "+sta);


    }
    
}
