public class book
{
   String Title1( String title)
    {
       return title;
       }
   String Code1( String code)
   {
       return code;
   }
   double Price1( double price)
   { 
       return price;
   }
   public static void main(String args[])
   {
     book obj= new book();
     System.out.println("name="+ (obj.Title1("Invisible Man")));
     System.out.println("code="+(obj.Code1("Ne1797")));
     System.out.println("price="+(obj.Price1(450.0)));
   }
}