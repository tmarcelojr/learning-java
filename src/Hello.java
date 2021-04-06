import java.util.Arrays;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        String message = "Hello \"Teo\"";
        // System.out.println(message);

        //  Arrays
//        int[] numbers = {2, 3, 5, 1, 4};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

        int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6} };
        System.out.println(Arrays.deepToString(numbers));
    }
}