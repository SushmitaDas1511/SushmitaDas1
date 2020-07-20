
 class Demo
{
    int n1,n2,ans;
    void init (int num1, int num2)
    {
       n1=  num1 ;
       n2= num2 ;
    }
    void calc()
    {
        ans=n1+n2;
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        Demo obj = new Demo();
        obj.init(4,6);
        obj.calc();
        obj.display();
    }
}
