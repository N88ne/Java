import java.util.*;
import java.util.stream.Collectors;

interface EmployeePosition
{
    String getJobTitle();
    double calcSalary(double baseSalary);
    public double GetInCome();
}
 class Employee
{
    private String name, surname, p;
    EmployeePosition position;
    private double salary,baseSalary;
    Employee(String name, String surname,  double baseSalary)
    {
        this.name=name;
        this.surname=surname;
        this.baseSalary=baseSalary;
    }
    public void ToString()
    {
        System.out.println(this.name+ " " + this.surname + " " + p + " " + getSalary());
    }
    public String getName()
    {
        return this.name;
    }
    public String getSurName()
    {
        return this.surname;
    }
    public double getSalary()
    {
        return position.calcSalary(this.baseSalary);
    }
    public double getBaseSalary()
    {
        return this.baseSalary;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setSurName(String surname)
    {
        this.surname=surname;
    }
    public void setPosition(EmployeePosition position)
    {
        this.position=position;
        p= position.getJobTitle();
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary=baseSalary;
    }

}
class Manager implements EmployeePosition
{
    private double InCome=((Math.random() * (140000-115000)) + 115000);
    public String getJobTitle()
    {
        return "Manager";
    }
    public double calcSalary(double baseSalary)
    {
        return baseSalary+0.05*InCome;
    }
    public double GetInCome()
    {
        return InCome;
    }
}
class TopManager implements EmployeePosition
{
    public Company company;
            TopManager(Company company)
            {
                this.company=company;
            }

    public String getJobTitle()
    {
        return "TopManager";
    }
    public double calcSalary(double baseSalary)
    {
       if(company.GetIncome()>10000000)
       {
           return baseSalary*2.5;
       }
       else
       {
           return baseSalary;
       }
    }
    @Override
    public double GetInCome() {
        return 0;
    }
}
class Operator implements EmployeePosition
{
    public String getJobTitle() {
        return "Operator";
    }
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

    @Override
    public double GetInCome() {
        return 0;
    }
}
class Company
{
    public ArrayList<Employee> employees;
    public Company()
    {
        this.employees= new ArrayList<>();
    }
    public void Hire(Employee employee)
    {
        this.employees.add(employee);
    }
    public void HireAll(ArrayList<Employee> employees)
    {
        this.employees.addAll(employees);
    }
    public void Fire(String name, String surname)
    {
        for (int i = 0; i < employees.size(); i++)
        {
            Employee employee = employees.get(i);
            if (employee.getName().equals(name) && employee.getSurName().equals(surname))
            {
                employees.remove(i);
                i--;
            }
        }
    }
    public void Fire(Employee employee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee_t = employees.get(i);
            if (employee_t.getName().equals(employee.getName()) && employee_t.getSurName().equals(employee.getSurName())) {
                employees.remove(i);
                i--;
            }
        }
    }
    public double GetIncome()
    {
        double income = 0;
        for (Employee employee: employees)
        {
            income = income + employee.position.GetInCome();
        }
        return income;
    }
    public List<Employee> GetTopSalaryStaff(int count) {
        if (count < 0) count = 0;

        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(count).collect(Collectors.toList());
    }

    public List<Employee> GetLowestSalaryStaff(int count)
    {
        if (count < 0) count = 0;
        return employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .limit(count).collect(Collectors.toList());
    }


}
public class Lab78Employee
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Company company = new Company();
        Employee one = new Employee("Иван", "Гаврилов",50000);
        one.setPosition(new Operator());
        company.Hire(one);
        Employee two = new Employee("Кирилл", "Рагудин",50000);
        two.setPosition(new Operator());
        company.Hire(two);
        Employee three = new Employee("Алекс", "Зоров",50000);
        three.setPosition(new Operator());
        company.Hire(three);
        Employee e1 = new Employee("Егор", "Данилов",80000);
        e1.setPosition(new Manager());
        company.Hire(e1);
        Employee e2 = new Employee("Вова", "Хорёшин",80000);
        e2.setPosition(new Manager());
        company.Hire(e2);
        Employee e3 = new Employee("Дмитрий", "Дуров",100000);
        e3.setPosition(new TopManager(company));
        company.Hire(e3);
       List<Employee> employeeList = company.GetTopSalaryStaff(15);
        System.out.println("Наивысшая зарплата: ");
        for (Employee employee: employeeList) {
            employee.ToString();
        }
       System.out.println("");
        employeeList = company.GetLowestSalaryStaff(30);
        System.out.println("Наименьшая зарплата: ");
        for (Employee employee: employeeList) {
            employee.ToString();

        }
        System.out.println("");
        int layoffCount = company.employees.size() / 2;
        System.out.println("\n");
        for (int i = 0; i < layoffCount; i++) {
            int pick =(int)((Math.random() * (company.employees.size()-0)) + 0);
            Employee employee = company.employees.get(pick);
            System.out.println("Уволил: ");
            employee.ToString();
            company.Fire(employee);
        }
        System.out.println("");

        employeeList = company.GetTopSalaryStaff(15);
        System.out.println("Наивысшая зарплата: ");
        for (Employee employee: employeeList) {
            employee.ToString();

        }
        System.out.println("");

       employeeList = company.GetLowestSalaryStaff(30);
        System.out.println("Наименьшая зарплата: ");
        for (Employee employee: employeeList) {
            employee.ToString();


        }
    }
}