import java.awt.*;

public class Day5 {

    public static void main(String [] arg)
    {
   int[][][] a={{{1,2,3},{2,2},{3,3,3,3},{4,4,4,4,4,4}},{{1,2,3},{2,2},{3,3,3,3},{4,4,4,4,4,4}}};

   for (int i=0;i<a.length;i++){
       for (int j=0;j<a[i].length;j++)
       {
           for (int k=0;k<a[i][j].length;k++)
           {
           System.out.print(a[i][j][k]+ " ");}
           System.out.println();
       }
       System.out.println();
   }

    }
}
