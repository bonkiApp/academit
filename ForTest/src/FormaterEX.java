/**
 * Created by Администратор on 19.06.16.
 */
//public class ForTest {
//    public static void main(String[] args) {
//        String h = null;
//        String y = null;
//        String k = null;
//        String d = "6";
//
//        String message = String.join(d, y, h, k);
//        System.out.println(message);

        import java.text.DecimalFormat;


        public class FormaterEX {
            public static void main(String[] args) {
                double causeDouble = 6.299999994;
                double d10 = 6.299999994;
                String formatedDouble = String.format("%.10f", causeDouble);
                DecimalFormat df = new DecimalFormat("#.#");
                System.out.println(causeDouble);
                System.out.println(df.format(d10));
                System.out.println(formatedDouble);
            }
        }




