import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers =  {1,567,45,43,456,554};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        int[] value = Arrays.copyOf(numbers, 3);
        int[] value2 = Arrays.copyOfRange(numbers, 3, 5);
        System.out.println(Arrays.toString(value));
        System.out.println(Arrays.toString(value2));
    }
}
