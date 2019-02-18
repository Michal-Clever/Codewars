package fundamentals;

public class Circle {
    public static double area(double radius)
    {
        if (radius <= 0)
            throw new IllegalArgumentException();
        else
            return Math.PI*radius*radius;
    }
}


//        Complete the function circleArea so that it will return the area of a circle with the given radius.
//        Round the returned number to two decimal places (except for Haskell).
//        If the radius is not positive or not a number, return false.
//
//        Example:
//
//        fundamentals.Circle.area(-1485.86);    //returns false
//        fundamentals.Circle.area(0);           //returns false
//        fundamentals.Circle.area(43.2673);     //returns 5881.25
//        fundamentals.Circle.area(68);          //returns 14526.72
