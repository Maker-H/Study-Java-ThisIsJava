public class Lib_Earth{
	//Field
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;
    static { //static block
        EARTH_SURFACE_AREA = 4* Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}//end of class
