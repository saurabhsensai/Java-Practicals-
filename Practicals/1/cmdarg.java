public class cmdarg {
    public static void main(String args[]){
        int fact = 1;
        int ar = Integer.parseInt(args[0]);
        for(int i = ar;i >= 1; i-- ){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
