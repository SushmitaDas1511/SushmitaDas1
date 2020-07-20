public class Area_Of_Rectangle
{
    double len;
    double ans;
    double breadth1;
   
    void init(int length, int breadth )
    {
        len = length ;
        breadth1 = breadth;
    }
    double calc ()
    {
        ans = len + breadth1;
        return ans; //caller
    }
    public static void main()
    {
       Area_Of_Rectangle obj = new Area_Of_Rectangle();
       obj.init(2,3);
       double result = obj.calc();
       System.out.println(result);

    }
}