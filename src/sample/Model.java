package sample;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Model {

    private Properties properties = new Properties();

    public Model() {
        try {
            properties.load(new FileReader("src/sample/comandos.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run_command(String property) {
        try {
            Runtime.getRuntime().exec(properties.getProperty(property));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
