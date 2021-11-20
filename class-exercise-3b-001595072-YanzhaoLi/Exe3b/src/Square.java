/**
 * 广场
 *
 * @author Yanzhao Li
 * @date 2021/11/03
 */
public class Square extends Rectangle{

    /**
     * square
     *
     * @param s side
     */
    public Square(int s) {
        super(s, s);
    }

    @Override
    public String toString() {
        return "Square{" +
                "h=" + h +
                ", w=" + w +
                '}';
    }
}
