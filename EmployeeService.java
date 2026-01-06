import java.time.LocalDate;
import java.util.*;

public class EmployeeService {

    private ArrayList<Employee> employeeList;
    private HashMap<Integer, Employee> employeeMap;

    public EmployeeService() {
        employeeList = FileUtil.loadEmployees();
        employeeMap = new HashMap<>();

        for (Employee e : employeeList) {
            employeeMap.put(e.getId(), e);
        }
    }

    // CREATE
    public void addEmployee(Employee employee) {
        if (employeeMap.containsKey(employee.getId())) {
            throw new IllegalArgumentException("Employee ID already exists");
        }
        employeeList.add(employee);
        employeeMap.put(employee.getId(), employee);
        FileUtil.saveEmployees(employeeList);
    }

    // READ
    public void viewAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        employeeList.forEach(System.out::println);
    }

    // UPDATE
    public void updateEmployee(int id, String dept, String position, double salary) {
        Employee emp = employeeMap.get(id);
        if (emp == null) {
            throw new NoSuchElementException("Employee not found");
        }
        emp.setDepartment(dept);
        emp.setPosition(position);
        emp.setSalary(salary);
        FileUtil.saveEmployees(employeeList);
    }

    // DELETE
    public void deleteEmployee(int id) {
        Employee emp = employeeMap.remove(id);
        if (emp == null) {
            throw new NoSuchElementException("Employee not found");
        }
        employeeList.remove(emp);
        FileUtil.saveEmployees(employeeList);
    }

    // SEARCH BY NAME
    public void searchByName(String name) {
        employeeList.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    // SEARCH BY DEPARTMENT
    public void searchByDepartment(String dept) {
        employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase(dept))
                .forEach(System.out::println);
    }

    // SALARY REPORT
    public void salaryReport() {
        double total = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        OptionalDouble avg = employeeList.stream().mapToDouble(Employee::getSalary).average();

        System.out.println("Total Salary Expense: ₹" + total);
        System.out.println("Average Salary: ₹" + (avg.isPresent() ? avg.getAsDouble() : 0));
    }
}
