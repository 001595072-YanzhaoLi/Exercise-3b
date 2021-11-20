import java.io.Serializable;

/**
 * shape
 *
 * @author Yanzhao Li
 * @date 2021/11/03
 */
public abstract class Shape implements Serializable {
    /**
     * calculation area
     *
     * @return double
     */
    abstract public double calculateArea();

    /**
     * calculate perimeter
     *
     * @return double
     */
    abstract public double calculatePerimeter();
}
