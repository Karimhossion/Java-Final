/*
 * Problem Name:  Write a java program to-
	Create an interface named Department with attributes 'deptName' and 'head' including abstract methods for printing these attributes.
Abstract methods:-
	✓ printDeptName()
	✓ printDeptHead()
	Then, Create a class named Office with attributes 'officeName', 'officeLocation', and 'numberOfEmployees' and include methods such as :-
	✓ getOfficeName()
	✓ getOfficeLocation()
	✓ getNumberOfEmployees()
	✓ displayOfficeDetails()
	Lastly, create a class named Employee extending Office and implementing the Department interface. This class should include attributes like 'employeeld", 'employeeName', 'position' and include methods like:-
	✓getEmployeeld()
		✓ getEmployeeName()
		✓ getPosition()
		✓ displayEmployeeDetails()
	Now, write the complete java program.
 */
package Lab_1;

interface Department {
    String deptName = " ";
    String head = " ";
    void printDeptName();
    void printDeptHead();
}
class Office {
    private String officeName;
    private String officeLocation;
    private int numberOfEmployees;
    public Office(String officeName, String officeLocation, int numberOfEmployees){
        this.officeName = officeName;
        this.officeLocation = officeLocation;
        this.numberOfEmployees = numberOfEmployees;
    }
    
    public String getOfficeName(){
        return officeName;
    }
    
    public String getOfficeLocation(){
        return officeLocation;
    }
    
    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }
    
    public void displayOfficeDetails(){
        System.out.println("Office Name : " + officeName);
        System.out.println("Location : " + officeLocation);
        System.out.println("Number of Employees : " + numberOfEmployees);
    }
}

class Employee extends Office implements Department {
    private int employeeId;
    private String employeeName;
    private String position;
    public Employee(String officeName, String officeLocation, int numberOfEmployees, int employeeId, String employeeName, String position) {
        super(officeName, officeLocation, numberOfEmployees);
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.position = position;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public String getPosition(){
        return position;
    }
    public void displayEmployeeDetails() {
        displayOfficeDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Position: " + position);
    }
    
    public void printDeptName(){
        System.out.println("Department Name : " + getOfficeName());
    }
    
    public void printDeptHead(){
        System.out.println("Department Head : " + getEmployeeName());
    }
}
public class Lab_10 {
    public static void main(String[] args) {
        Employee obj = new Employee("VivaSoft", "Dhaka", 10000, 100, "Md karim", "Software Engineer");
        obj.displayEmployeeDetails();
        obj.printDeptName();
        obj.printDeptHead();
    }
}
