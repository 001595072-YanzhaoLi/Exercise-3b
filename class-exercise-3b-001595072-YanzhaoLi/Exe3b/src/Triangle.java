/**
 * triangle
 *
 * @author Yanzhao Li
 * @date 2021/11/03
 */
public class Triangle extends Shape{
    static int numOfSide=3;
    private int h;
    private int w;
    private int s1;
    private int s2;
    private int s3;
    static String color="black";

    /**
     * triangle
     *
     * @param h  height
     * @param w  wide
     * @param s1 side1
     * @param s2 side2
     * @param s3 side3
     */
    Triangle(int h, int w, int s1, int s2, int s3){
        this.h=h;
        this.w=w;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    /**
     * calculation area
     *
     * @return double
     */
    @Override
    public double calculateArea() {
        return h*w/2;
    }

    /**
     * calculate perimeter
     *
     * @return double
     */
    @Override
    public double calculatePerimeter() {
        return s1+s2+s3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "h=" + h +
                ", w=" + w +
                ", s1=" + s1 +
                ", s2=" + s2 +
                ", s3=" + s3 +
                '}';
    }
}
