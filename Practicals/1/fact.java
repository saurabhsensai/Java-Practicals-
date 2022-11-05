class fact{

    public static void main(String args[]){

        int fact = 1;

        for(int i = Integer.parseInt(args[0]) ; i>0 ;i--){

         fact = fact * i;


        }

        System.out.println(fact);
    }
}