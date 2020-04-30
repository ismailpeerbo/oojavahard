public class SphereCalc {
    double radius;

    public void setRadus( double r ) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceArea() {
        return 4*Math.PI*radius*radius;
    }

    public double getVolume() {
        return 4*Math.PI*Math.pow(radius, 3) / 3.0;
    }
}

// This object is very similar to the ones in the last couple of exercises. A single instance variable this
// time, one mutator method (setRadius()) and three accessor methods. (The surface area of a sphere
// is 4πr2, and the volume of a sphere is 4/3 πr3.)