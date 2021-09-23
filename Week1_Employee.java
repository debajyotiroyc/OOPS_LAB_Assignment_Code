import java.util.*;
public class Employee
{
    private String name,designation;
    private double sal;
    private int emp_id;
    
    Employee()
    {
        name="Ajay";
        designation="Fresher";
        emp_id=1785;
        sal= 15000.0;
    }
    
    Employee(String n)
    {
        name=n;
        designation="Temp";
        emp_id=3396;
        sal= 25000.0;
    }
    
    Employee(String n,String d,double s, int id)
    {
        name=n;
        designation=d;
        emp_id=id;
        sal= s;
    }
    
    public static void main()
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter Employee Details: ");
       System.out.println("--------------------------------------------");
       System.out.println("Enter the name of the fresher employee : ");
       String n1=in.nextLine();
       System.out.println("Enter the name of the executive employee: ");
       String n2=in.nextLine();
       System.out.println("Enter the designation of the executive employee: ");
       String desig=in.nextLine();
       System.out.println("Enter the employee id of the executive employee: ");
       int id=in.nextInt();
       System.out.println("Enter the salary of the executive employee: ");
       double s=in.nextDouble();
       Employee emp[] = new Employee[3];
       emp[0]= new Employee();
       emp[1]= new Employee(n1);
       emp[2]= new Employee(n2,desig,s,id);
       System.out.println("--------------------------------------------");
       System.out.println("Name\t"+"\tDesignation\t"+"\tEmployee ID\t"+"\tSalary\t");
       System.out.println(emp[0].name+"\t\t"+emp[0].designation+"\t\t\t"+emp[0].emp_id+"\t\t\t"+emp[0].sal);
       System.out.println(emp[1].name+"\t\t"+emp[1].designation+"\t\t\t"+emp[1].emp_id+"\t\t\t"+emp[1].sal);
       System.out.println(emp[2].name+"\t\t"+emp[2].designation+"\t\t\t"+emp[2].emp_id+"\t\t\t"+emp[2].sal);
    }
}
