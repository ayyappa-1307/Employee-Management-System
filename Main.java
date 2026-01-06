import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add 2.View 3.Update 4.Delete 5.Search Name 6.Search Dept 7.Salary Report 0.Exit");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Department: ");
                        String dept = sc.nextLine();
                        System.out.print("Position: ");
                        String pos = sc.nextLine();
                        System.out.print("Salary: ");
                        double sal = sc.nextDouble();

                        service.addEmployee(
                                new Employee(id, name, dept, pos, sal, LocalDate.now()));
                        System.out.println("Employee added!");
                    }
                    case 2 -> service.viewAllEmployees();
                    case 3 -> {
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("New Dept: ");
                        String d = sc.nextLine();
                        System.out.print("New Position: ");
                        String p = sc.nextLine();
                        System.out.print("New Salary: ");
                        double s = sc.nextDouble();
                        service.updateEmployee(id, d, p, s);
                        System.out.println("Employee updated!");
                    }
                    case 4 -> {
                        System.out.print("ID: ");
                        service.deleteEmployee(sc.nextInt());
                        System.out.println("Employee deleted!");
                    }
                    case 5 -> {
                        sc.nextLine();
                        System.out.print("Name: ");
                        service.searchByName(sc.nextLine());
                    }
                    case 6 -> {
                        sc.nextLine();
                        System.out.print("Department: ");
                        service.searchByDepartment(sc.nextLine());
                    }
                    case 7 -> service.salaryReport();
                    case 0 -> System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
