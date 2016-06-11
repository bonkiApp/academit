
public class Strings {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            builder.append(i)
                    .append(", ");
        }
        builder.delete(builder.length()-2, builder.length());
        System.out.println(builder.toString());
    }

    String string = "1, 2, 3, 4, 5";
    for (String s: string.split(", ")){

    }

//    int[] numbers = Integer.parseInt(string);
}

