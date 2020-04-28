public class SquareRootTester {
    public static void main( String[] args ) {

        SquareRootFinder sqrt = new SquareRootFinder();

        double max = 0, maxN = 0, totalDiff = 0.0;
        double fakeroot, realroot, diff;

        System.out.print( "Testing Square root algorithm..." );
        for (double n = 0; n < 2000; n += 0.01) {
            sqrt.setNumber(n);
            fakeroot = sqrt.getRoot();
            realroot = Math.sqrt(n);
            diff = Math.abs( fakeroot - realroot );
            if (!Double.isNaN(diff) && diff > 0) {
                totalDiff = totalDiff + diff;
            }
            if (diff > max ) {
                max = diff;
                maxN = n;
            } 
        }

        if (max > 0.000001 ) {
            System.out.println( "FAIL" );
            System.out.println( "Worst difference was " + max + " for " + maxN );
        } else {
            System.out.println( "PASS" );
        }
        System.out.println( "Total differance in the range was: " + totalDiff );
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