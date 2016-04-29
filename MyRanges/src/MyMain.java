public class MyMain {
    public static void main(String[] args) {
        MyRange range1 = new MyRange(-10.5, 25.1);
        double number = 11.4;

        String answer = (MyRange.isInside(number)) ? "" : " не";
        System.out.printf("Ваше число%s входит в заданный интервал.%n", answer);

        double range = MyRange.findRange(range1);
        System.out.printf("Длина интервала %f%n", range);

        MyRange range2 = new MyRange(-5.78, 42.99);


    }
}