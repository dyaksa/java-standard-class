public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();

        System.out.println(doubleValue);

        String number = "10000";
        int result = Integer.parseInt(number);
        System.out.println(result);
    }
}
