import java.util.Scanner; 

public class SquareRootDriver {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        double n;

        SquareRootFinder sqrt = new SquareRootFinder();

        do {
            System.out.print( "Enter a number (or <=0 to quit): " );
            n = keyboard.nextDouble();

            if ( n > 0 ) {
                sqrt.setNumber(n);
                System.out.println( sqrt.getRoot() );
            }
        } while ( n > 0 );
    }
}

// For most programming tasks, there is more than one person involved. 
// It is often better to let a single person say “here is an object, you use it in this way: 
// put in a number here and the answer will come out here.” 
// This is a form of information hiding called “encapsulation”, 
// and it is one of the important concepts in object-oriented programming.

// In encapsulation, an object has fields and forces the user of the object to use the methods provided 
// instead of messing with the variables directly. In this example, SquareRootFinder allows the user of the 
// class to pass in a value for n through the setNumber() method but does not allow them to pass in a value 
// for iterations.