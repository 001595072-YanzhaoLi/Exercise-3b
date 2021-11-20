/**
 * rectangle
 *
 * @author Yanzhao Li
 * @date 2021/11/03
 */
public class Rectangle extends Shape{
    static int numOfSide=4;
    protected int h;
    protected int w;
    static String color="black";

    /**
     * rectangle
     *
     * @param h height
     * @param w wide
     */
    public Rectangle(int h,int w){
        this.h=h;
        this.w=w;
    }

    /**
     * calculation area
     *
     * @return double
     */
    @Override
    public double calculateArea() {
        return h*w;
    }

    /**
     * calculate perimeter
     *
     * @return double
     */
    @Override
    public double calculatePerimeter() {
        return (h+w)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "h=" + h +
                ", w=" + w +
                '}';
    }
}
