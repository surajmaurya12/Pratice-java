
import java.io.File;

public class Str {

    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/username/Desktop/file.txt");
            if (file.exists()) {
                System.out.println("File exists");
            } else {
                System.out.println("File does not exist");
            }
        }

    }
    catch (Exception e
        

    ); {
            System.out.println("An error occurred");
    }

}
