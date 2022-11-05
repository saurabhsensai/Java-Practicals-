public class methodoverloading {

    void printarray(int a[]){
        for (int element: a) {
            System.out.println(element);
        }
    }

    void printarray(String s[]){
        for (String element: s) {
            System.out.println(element);
        }
    }
    public static void main(String args[]){

        methodoverloading n = new methodoverloading();
        int b[] = {12,34,56,67};
        String s[] = {"Saurabh","Nale","Hii"};

        n.printarray(b);
        System.out.println();
        n.printarray(s);
    }
}
