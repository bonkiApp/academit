
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(5,1);
        Point point2 = new Point(10,3);

        double distanse = point1.foundDistanse(point2);

        System.out.println(distanse);

        System.out.println(point1.toString());

    }

}
