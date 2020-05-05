public class RectangleDriver {
   public static void main( String[] args ) {
       // Rectangle r = new Rectangle();
       // r.length = 10;
       // r.height = 5;

       Rectangle r = new Rectangle(10, 5);
       System.out.println( "The area is " + r.getArea() );

       Rectangle j = new Rectangle(50, 33);
       System.out.println( "The area is " + j.getArea() );

       Rectangle k = new Rectangle(12, 77);
       System.out.println( "The area is " + k.getArea() );
   } 
}