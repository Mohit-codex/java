import java.io.*;
import java.util.Scanner;

public class FileHandlingAllInOne {

    public static void main(String[] args) {

        String fileName = "example.txt";

        // 1️⃣ WRITE TO FILE
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello! This is the first line.\n");
            writer.write("File handling in Java is easy.\n");
            writer.close();
            System.out.println("✔ File written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing file.");
            e.printStackTrace();
        }

        // 2️⃣ READ FILE
        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);

            System.out.println("\n📖 Reading file content:");
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        // 3️⃣ APPEND TO FILE
        try {
            FileWriter writer = new FileWriter(fileName, true); // true = append mode
            writer.write("This line is appended later.\n");
            writer.close();
            System.out.println("\n✔ Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error while appending file.");
        }

        // 4️⃣ READ AGAIN AFTER APPEND
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            System.out.println("\n📖 Reading updated file:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        // 5️⃣ DELETE FILE
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("\n🗑 File deleted successfully.");
        } else {
            System.out.println("\n❌ Failed to delete file.");
        }
    }
}
