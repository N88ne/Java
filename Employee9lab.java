import java.util.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

interface HandleEmployee
{
    public List<Employee> handleemployees(ArrayList<Employee> Employees ,int k);
}
class Employee
{
    private String Name,SurName,Adress,FonNumber;
    private LocalDate BirthDay;
    private Double Salary;
    Employee(String Name, String SurName, String Adress, String FonNumber, LocalDate BirthDay, Double Salary)
    {
        this.Name=Name;
        this.SurName=SurName;
        this.Adress=Adress;
        this.FonNumber=FonNumber;
        this.Salary=Salary;
        this.BirthDay=BirthDay;
    }
    public String getName()
    {
        return Name;
    }
    public String getSurName()
    {
        return SurName;
    }
    public String getAdress()
    {
        return Adress;
    }

    public Double getSalary() {
        return Salary;
    }

    public LocalDate getBirthDay() {
        return BirthDay;
    }

    public String getFonNamber() {
        return FonNumber;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public void setBirthDay(LocalDate birthDay) {
        BirthDay = birthDay;
    }

    public void setFonNamber(String fonNamber) {
        FonNumber = fonNamber;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }
    public void ToString()
    {
        System.out.println(this.Name + " " + this.SurName + " " + this.Adress + " " + this.FonNumber + " " + this .BirthDay + " " + this.Salary);
    }

}
class Company {
    public ArrayList<Employee> Employees = new ArrayList<>();

    public void Hire(Employee Employee) {
        this.Employees.add(Employee);
    }

    public void Fire(Employee Employee) {
        for (int i = 0; i < this.Employees.size(); i++) {
            if (Employees.get(i).getName().equals(Employee.getName()) && Employees.get(i).getSurName().equals(Employee.getSurName())) {
                Employees.remove(i);
                i--;
            }
        }
    }

}
class HandEmployees implements HandleEmployee
{
    public List<Employee> handleemployees(ArrayList<Employee> Employees , int k)
    {
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getSalary() < k) {
                Employees.remove(i);
                i--;
            }
        }
        return Employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(Employees.size()).collect(Collectors.toList());


    }
}
public class Employee9lab {
    public static int getIntRandomNumber(int min, int max) {
            return (int) ((Math.random() * (max - min)) + min);
    }
    public static double getDRandomNumber(int min, int max) {
        return (Math.random() * (max - min)) + min;
    }
    public static String getRandomName()
    {
        char O;
        String Name = "";
        for(int i=0;i<5;i++)
        {
            O = (char) getIntRandomNumber(65,90);
            Name = Name + O;
        }
        return Name;
    }
    public static String getRandomSurName()
    {
        char O;
        String SurName = "";
        for(int i=0;i<8;i++)
        {
            O = (char) getIntRandomNumber(65,90);
            SurName = SurName + O;
        }
        return SurName;
    }
    public static String getRandomNumber()
    {
        char O;
        String Num = "";
        for(int i=0;i<11;i++)
        {
            if(i == 0)
            O = (char) getIntRandomNumber(49,57);
            else
                O = (char) getIntRandomNumber(48,57);
            Num = Num + O;
        }
        return Num;

    }
    public static String getRandomAdress()
    {
        char O;
        String Adress = "";
        for(int i=0;i<7;i++)
        {
            O = (char) getIntRandomNumber(65,90);
            Adress = Adress + O;
        }
        Adress = Adress + " "  + getIntRandomNumber(1,100);
        return Adress;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Company Ps = new Company();
        for(int i=0; i < 10 ;i++) {
            String Name = getRandomName();
            String SurName = getRandomSurName();
            String Adress = getRandomAdress();
            LocalDate Time = LocalDate.of(getIntRandomNumber(1980, 2000), getIntRandomNumber(1, 12), getIntRandomNumber(1, 30));
            String Num = getRandomNumber();
            double Sal = getDRandomNumber(10000, 30000);
            Employee All = new Employee(Name, SurName, Adress, Num, Time, Sal);
            Ps.Hire(All);
            Ps.Employees.get(i).ToString();
        }
        List<Employee> Ps1 = new ArrayList<Employee>();
        HandEmployees hand = new HandEmployees();
        System.out.println("After sort:");
        Ps1= hand.handleemployees(Ps.Employees,20000);

        for(int i=0; i < Ps1.size() ;i++)
        {
            Ps1.get(i).ToString();
        }
        HandleEmployee one = new HandleEmployee() {
            @Override
            public ArrayList<Employee> handleemployees(ArrayList<Employee> Employees, int k)
            {
                for(int i=0;i < Employees.size();i++)
                {
                    if(Employees.get(i).getSalary()<k)
                    {
                        Employees.remove(i);
                        i--;
                    }
                }
                return Employees;
            }
        };

    }

}
