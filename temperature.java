/*wap that implements a temperature class and provides functionality to convert F to oC.
 */
  
class temperature
{
    double temp;double celsius;
    temperature(double temp1)
    {
        temp= temp1;
     }
    void calc()
    {
       double celsius1=(5.0*(temp-32))/9.0;
       celsius=celsius1;
    }
    void display()
    { System.out.println("temp in Fahrenheit="+temp);
        System.out.println("temp in celsius="+ celsius);
    }
    public static void main(String args[])
    {
        temperature obj= new temperature(50.0);
        obj.calc();
        obj.display();
    }
}