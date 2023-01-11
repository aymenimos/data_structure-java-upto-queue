    public class array{


    public  static void main(String [] args){

        //   double [][] a=new double[4][5];
        //   int s1=a.length;
        //   int s2=a[0].length;

        // System.out.println(a[-1]);
        // System.out.println(s2);
        int [] a={1,2,3,4,5,6,7,8,9,0};
    
      int len=a.length;
        for (int j=0; j<20;j++) {
            System.out.print(a[j%len]+" ");
        
        
    }


    }
    }