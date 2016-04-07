import java.text.DecimalFormat;

public class Sphere {

	double diameter, radius, volume, SA, r;

	void newDiameter (double newValue) {
	    diameter = newValue;
	    radius = diameter / 2;
	    r = radius;
	    volume = (4* Math.PI * Math.pow(r, 3))/3;
	    SA = 4 * Math.PI * Math.pow(r, 2);

}
	 public String toString() {
	        DecimalFormat fmt = new DecimalFormat ("0.###");
	        return ("Diameter: " + fmt.format(diameter) + " Volume: " + fmt.format(volume) + " Surface Area: " + fmt.format(SA));
	    }
}