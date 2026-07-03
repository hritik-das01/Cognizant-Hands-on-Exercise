package HandsOn_Exercises;

class Employee{
    int employeeid;
    String name;
    String position;
    Float salary;

    public Employee(int employeeid, String name, String position, Float salary){
        this.employeeid = employeeid;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
}

public class Ex_4_Employee_Managemenet{

    public static void addEmployee(Employee[] employees, Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.println("Employee added: " + employee.name);
                return;
            }
        }
        System.out.println("Employee array is full. Cannot add more employees.");
    }

    public static void deleteEmployee(Employee[] employees, int employeeId) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].employeeid == employeeId) {
                System.out.println("Employee deleted: " + employees[i].name);
                employees[i] = null;
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public static void searchEmployee(Employee[] employees, int employeeId) {
        for (Employee employee : employees) {
            if (employee != null && employee.employeeid == employeeId) {
                System.out.println("Employee found: " + employee.name + ", Position: " + employee.position + ", Salary: " + employee.salary);
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }
    public static void traverseEmployees(Employee[] employees) {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println("ID: " + employee.employeeid + ", Name: " + employee.name + ", Position: " + employee.position + ", Salary: " + employee.salary);
            }
        }
    }
    public static void main(String[] args) {

    Employee[] employees = new Employee[5];
    employees[0] = new Employee(1, "Hritik", "Manager", 75000.56f);
    employees[1] = new Employee(2, "Shana", "Developer", 60000.5f);
    employees[2] = new Employee(3, "Michael", "Designer", 55000.0f);
    employees[3] = new Employee(4, "Ella Bright", "Tester", 50000.0f);
    employees[4] = new Employee(5, "Mike", "Support", 45000.0f);

    
    addEmployee(employees, new Employee(6, "Sarah", "HR", 55000.0f));
    deleteEmployee(employees, 3);
    searchEmployee(employees, 2);
    traverseEmployees(employees);

    for(int i=0;i<employees.length;i++){
        if(employees[i] != null){
            System.out.println("ID: " + employees[i].employeeid + ", Name: " + employees[i].name + ", Position: " + employees[i].position + ", Salary: " + employees[i].salary);
        }
    }
}
}