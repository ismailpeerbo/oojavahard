public class SphereCalc2 {
    double radius, area, volume;

    public void setRadius( double r ) {
        radius = r;
        area = 4*Math.PI*r*r;
        volume = 4*Math.PI*Math.pow(r,3) / 3.0;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceArea() {
        return area;
    }

    public double getVolume() {
        return volume;
    }
}

//
// SphereCalc2 has three fields instead of just one. And inside the setRadius() mutator method, it 
// doesn’t just set the radius, it also goes ahead and computes the surface area and volume, too.

// There’s a trade-off here. Each instance of a SphereCalc2 object would take up slightly more memory 
// than each SphereCalc object, because of the extra fields, and creating a instance of a SphereCalc2 
// object would take slightly longer than instantiating a SphereCalc object because it does more 
// calculations up front.