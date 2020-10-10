import java.util.Scanner;
class Dog{
    private int age;
    private String name;
    Dog(int age, String name)
    {
        this.age=age;
        this.name=name;
    }
    Dog()
    {

    }
    public int GetAge()
    {
        return age;
    }
    public String GetName()
    {
        return name;
    }
    public void SetName(String name)
    {
        this.name = name;
    }
    public void SetAge(int age)
    {
        this.age = age;
    }
    public int GetPeopleAge()
    {
        return age*7;
    }
    public void ToString()
    {
        System.out.println(name);
        System.out.format("%d \n",GetPeopleAge());
    }
}
public class PitomnikSobak {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Dog[] one = new Dog[10];
        int age,n;
        String name;
        System.out.println("Сколько собак?");
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Введите возраст собаки");
            age = sc.nextInt();
            System.out.println("Введите кличку собаки");
            name = sc.next();
            one[i] = new Dog(age,name);
        }
        System.out.println("\n");
        for(int i=0;i<n;i++)
        {
            one[i].ToString();
        }

    }
}
