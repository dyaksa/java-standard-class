import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        joiner.add("Dyaksa");
        joiner.add("Jauharuddin");
        joiner.add("Nour");

        System.out.println(joiner);
    }
}
