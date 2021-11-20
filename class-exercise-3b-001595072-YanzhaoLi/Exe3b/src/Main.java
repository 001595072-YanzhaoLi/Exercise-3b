import java.io.*;

/**
 * Main
 *
 * @author Yanzhao Li
 * @date 2021/11/15
 */
public class Main {
    /**
     * Main
     *
     * @param args args
     */
    public static void main(String[] args){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("my.out"));
            Shape[] grid1 = new Shape[4];
            grid1[0] = new Triangle(3, 4, 3, 4, 5);
            grid1[1] = new Rectangle(3, 4);
            grid1[2] = new Square(3);
            grid1[3] = new Circle(4);
            oos.writeObject(grid1);
            oos.flush();
            oos.close();
            ObjectInputStream oin = null;
            oin = new ObjectInputStream(new FileInputStream("my.out"));
            Shape[] grid2 = (Shape[]) oin.readObject();
            System.out.println(grid2[0]);
            System.out.println("area" + grid2[0].calculateArea() + ", perimeter" + grid2[0].calculatePerimeter());
            System.out.println(grid2[1]);
            System.out.println("area" + grid2[1].calculateArea() + ", perimeter" + grid2[1].calculatePerimeter());
            System.out.println(grid2[2]);
            System.out.println("area" + grid2[2].calculateArea() + ", perimeter" + grid2[2].calculatePerimeter());
            System.out.println(grid2[3]);
            System.out.println("area" + grid2[3].calculateArea() + ", perimeter" + grid2[3].calculatePerimeter());
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
