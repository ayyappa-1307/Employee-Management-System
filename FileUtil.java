import java.io.*;
import java.util.ArrayList;

public class FileUtil {

    private static final String FILE_NAME = "employees.dat";

    public static void saveEmployees(ArrayList<Employee> employees) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
        } catch (IOException e) {
            System.out.println("Error saving employee data.");
        }
    }

    public static ArrayList<Employee> loadEmployees() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (ArrayList<Employee>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }
}

