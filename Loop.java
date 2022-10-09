public class Loop {

    public static void main(String[] args) {
        
        int [][] myname = { 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {0}
        };

      for(int i = 0; i < myname.length; i++) {
        for(int j = 0; j < myname[i].length; j++) {
           System.out.print(myname[0][2]);
        }
      }

    }

}
