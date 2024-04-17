import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Dyaksa Jauharuddin Nour";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while (tokenizer.hasMoreTokens()) {
            String value = tokenizer.nextToken();
            System.out.println(value);
        }
    }
}
