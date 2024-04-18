import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String originalText = "Dyaksa Jauharuddin nour";

        String encoded = Base64.getEncoder().encodeToString(originalText.getBytes());
        System.out.println(encoded);

        byte[] bytesDecoder = Base64.getDecoder().decode(encoded);
        String decoded = new String(bytesDecoder);
        System.out.println(decoded);
    }
}
