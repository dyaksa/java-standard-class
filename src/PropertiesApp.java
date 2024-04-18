import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println("host: " + host);
            System.out.println("port: " + port);
            System.out.println("username: " + username);
            System.out.println("password: " + password);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Dyaksa");
            properties.put("name.middle", "Jauharuddin");
            properties.put("name.last", "Nour");

            properties.store(new FileOutputStream("app.properties"), "Biodata properties");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
