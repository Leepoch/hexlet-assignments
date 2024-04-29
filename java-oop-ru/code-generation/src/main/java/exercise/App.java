package exercise;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path filepath, Car car) {
        try {
            var jsonString = car.serialize();
            Files.writeString(filepath, jsonString);
        } catch (Exception e) {
            System.out.println("Error");;
        }
    }

    public static Car extract(Path filepath) {
        try {
            return Car.unserialize(Files.readString(filepath));
        } catch (Exception e) {
            System.out.println("Error");
            throw new RuntimeException();
        }
    }
}
// END
