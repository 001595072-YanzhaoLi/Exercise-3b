/**
 * Circle
 *
 * @author Yanzhao Li
 * @date 2021/11/03
 */
public class Circle extends Shape{
    static int numOfSide=1;
    static final double PI = 3.14159265358979323846;
    private int d;
    static String color="black";

    /**
     * Circle
     *
     * @param d diameter
     */
    public Circle(int d){
        this.d=d;
    }

    /**
     * calculation area
     *
     * @return double
     */
    @Override
    public double calculateArea() {
        return PI*(d/2)*(d/2);
    }

    /**
     * calculate perimeter
     *
     * @return double
     */
    @Override
    public double calculatePerimeter() {
        return PI*d;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "d=" + d +
                '}';
    }
}
