

public class Circle
{
    double radius;
    double pi = 3.14;
    public void init (double r )
    {
        radius=r;
    }
    public double calc()
    {
            double ans = pi*radius*radius;
            return ans ;
            
        
    }
}