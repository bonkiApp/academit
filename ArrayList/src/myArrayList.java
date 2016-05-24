import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        int[] myArray = {2, 4, 5, 78, 5, -4, 5, 5, 2, 4, 5, 15, 54, 14, 54, 1, 45, 151, 12, 41};
        ArrayList<Integer> even = new ArrayList<>();

        for (int item : myArray) {
            if (item % 2 == 0) {
                even.add(item);
            }
        }

        System.out.println(even.toString());
        System.out.println(even.size());
    }
}
