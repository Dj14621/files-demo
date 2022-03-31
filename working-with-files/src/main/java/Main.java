import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    private static final Path filePath = Paths.get(System.getProperty("user.dir") + "\\resources\\sample_data.ext");
    //private static final Path filePathForMac = Path.get(C: + "\\resources\\sample_data.ext");
    public static void main(String[] args) throws IOException {
        String welcome = "Welcome to Files!";
        System.out.println(welcome);

        //Create
        System.out.println("\nCalling the create file method.");
        createAFile();

        //Update
        System.out.println("\nCalling the update file method.");
        writeAFile();

        //Read
        System.out.println("\nCalling the read file method.");
        readAFile();

        //Delete
        System.out.println("\nCalling the delete file method.");
        deleteAFile();
    }
    //Create
    public static void createAFile() {
        try {
            Files.createFile(filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Read
    public static void readAFile() {
        String temp;
        try {
            temp = Files.readString(filePath);
            System.out.println(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Update
    public static void writeAFile() {
        try {
            Files.writeString(filePath, "This is the end my Friend...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Delete
    public static void deleteAFile() throws IOException {
        Files.delete(filePath);
    }
}
