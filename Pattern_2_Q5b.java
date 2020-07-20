public class Pattern_2_Q5b
{
    public static void main(String args[])
   {
      int n=1;
        for(int i=5;i>=n;i--)
        {
          for(int j =1;j<=i;j++)
          {
            System.out.print((char) ('a'+(j-1))+"");
            }
          System.out.println();
      }
   }
}