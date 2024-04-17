public class StringBuilderApp {
    // string builder memakai 1 thread
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Dyalsa");
        builder.append(" ");
        builder.append("Jauharuddin");
        builder.append(" ");
        builder.append("Nour");

        System.out.println(builder.toString());
    }
}
