public class Rectangle {
    private int length, width;

    public Rectangle() {
        length = width = 0;
    }    

    public Rectangle( int l, int w ) {
        length = l;
        width = w;
    }
    
    public int getArea() {
        return length * width;
    }
}

// here are two constructors. There are three things you should remember about constructors.
// 1. They have the same name as the class (Rectangle in this case).
// 2. They do not have a return type – not even “void”.
// 3. Their “job” is to make sure all necessary setup has been done. This means initializing all the
// instance variables, but sometimes other stuff happens, too.