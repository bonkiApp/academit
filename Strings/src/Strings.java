
public class Strings {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            builder.append(i)
                    .append(", ");
        }
        builder.delete(builder.length() - 2, builder.length());
        System.out.println(builder.toString());


        String strings = "1, 2, 3, 4, 5";
        String parts[] = strings.split(", ");
        int sum=0;
        for (String s: parts){
            sum+=Integer.parseInt(s);
        }
        System.out.println(parts[2]);
        System.out.println(sum);

//    int[] numbers = Integer.parseInt(string);
    }
}
