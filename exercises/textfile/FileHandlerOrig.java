package exercises.textfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private static final String FILE_PATH = "data.txt";
    
    public static void main(String[] args) {
        // Example usage
        create("1,John Doe,john@example.com");
        create("2,Jane Smith,jane@example.com");
        
        System.out.println("All records:");
        readAll().forEach(System.out::println);
        
        update("2,Jane Updated,jane.updated@example.com");
        
        System.out.println("\nAfter update:");
        readAll().forEach(System.out::println);
        
        delete("1");
        
        System.out.println("\nAfter deletion:");
        readAll().forEach(System.out::println);
    }
    
    public static void create(String record) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            out.println(record);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read all records
    public static List<String> readAll() {
        List<String> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                records.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return records;
    }

    // Read single record by ID
    public static String readById(String id) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(id + ",")) {
                    return line;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return null;
    }

    public static void update(String updatedRecord) {
        String id = updatedRecord.split(",")[0];
        List<String> records = readAll();
        
        try (FileWriter fw = new FileWriter(FILE_PATH);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            
            for (String record : records) {
                if (record.startsWith(id + ",")) {
                    out.println(updatedRecord); // Write updated record
                } else {
                    out.println(record); // Write original record
                }
            }
        } catch (IOException e) {
            System.err.println("Error updating file: " + e.getMessage());
        }
    }

    public static void delete(String id) {
        List<String> records = readAll();
        
        try (FileWriter fw = new FileWriter(FILE_PATH);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw)) {
            
            for (String record : records) {
                if (!record.startsWith(id + ",")) {
                    out.println(record); // Write all except the one to delete
                }
            }
        } catch (IOException e) {
            System.err.println("Error deleting from file: " + e.getMessage());
        }
    }
}
