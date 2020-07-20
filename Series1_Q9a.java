public class Series1_Q9a
{
   public static void main (String args [])
   {
       int sumOfSeries = 0;
       int i = 2;
       while(i<=20)
       {
           if (i%4==0)
           {
               sumOfSeries = sumOfSeries - i;
            }
            else
            {
                sumOfSeries = sumOfSeries + i;
            }
            i = i+2;
        }
        System.out.println("Sum of the series :" + sumOfSeries);
    }
}
       