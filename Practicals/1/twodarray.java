public class twodarray {
    public static void main(String args[]){
  
      int[][] a = {{1,2,3},{2,3,4}};
      int sum2 = 0;
    //   System.out.println(a[1][2]);
    for (int i = 0 ; i<2 ; i++){
        for(int j = 0; j < 3 ; j++ ){
            sum2 = sum2 +a[i][j];
        }
    }
    
    System.out.println(sum2);

    }
    
}
