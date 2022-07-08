package FuramaResort.Services.ClassImpl;

import FuramaResort.Models.Person.Employee;
import FuramaResort.Services.Interface.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeesList;

    static {
        employeesList = new ArrayList<>();
        employeesList.add(new Employee("Nguyen Van A","18/01/2001", "Nam","23", "0705944385","anhhtgcd191331",1, "Trung cấp", "giám đốc",35000000));
    }


    @Override
    public List<Employee> findAll() {
        return employeesList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    @Override
    public void editEmployee(int idEmployee) {
        Scanner scanner = new Scanner(System.in);
        for(Employee employee: employeesList){
            if(employee.getEmployeeID() == idEmployee){

            }
        }
    }
}
