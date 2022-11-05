


class room{
    int roomno,roomarea;
    String roomtype,ACmachine;
    
  

    void setdata(){
    
        roomno = 106;
        roomtype= "Delux";
        roomarea = 1500;
        ACmachine= "yes";

    
    }

    void display(){
      
    System.out.println("Roomno = " + roomno);
    System.out.println("Roomtype = "+ roomtype);
    System.out.println("Roomarea = "+ roomarea +" sqfeet");
    System.out.println("ACmachine = "+ ACmachine);

    }


    public static void main(String args[]){


       
        room ag = new room();
        
        ag.setdata();
        ag.display();

    }
}