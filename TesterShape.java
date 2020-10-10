import java.util.Scanner;
abstract class Shape
{
    private int a;
    private int b;
    private String S;
    public void SetA(int a)
    {
        this.a=a;
    }
    public void SetB(int b)
    {
        this.b=b;
    }
    public void SetS(String S)
    {
        this.S=S;
    }
    public int GetA()
    {
        return a;
    }
    public int GetB()
    {
        return b;
    }
    public String GetS()
    {
        return S;
    }
    public abstract double Area();
    public abstract void ToString();
}
class Circle extends Shape
{
    Circle(int R,String CenterCirrcle)
    {
        SetS(CenterCirrcle);
        SetA(R);
    }
    public double Area()
    {
        return 3.14*GetA()*GetA();
    }
    public void ToString()
    {
        System.out.println("Вывод окружности:");
        System.out.format("%d \n",GetA());
        System.out.println(GetS());
        System.out.println(Area());
        System.out.println(Circumference());
    }

    public double Circumference()
    {
        return 2*3.14*GetA();
    }

}
class Square extends Shape
{
    Square(int a)
    {
        SetA(a);
    }
    public double Area()
    {
        return GetA()*GetA();
    }

    public void ToString()
    {
        System.out.println("Вывод квадрата:");
        System.out.println(GetA());
        System.out.println(Area());
    }
}
class Rectangle extends Shape
{
    Rectangle(int a, int b)
    {
        SetA(a);
        SetB(b);
    }
    public double Area()
    {
        return GetA()*GetB();
    }

    public void ToString()
    {
        System.out.println("Вывод прямоугольника:");
        System.out.println(GetA());
        System.out.println(GetB());
        System.out.println(Area());
    }
}
public class TesterShape
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int R;
        String CenterCirrcle;
        System.out.println("Введите радиус окружности:");
        R = sc.nextInt();
        System.out.println("Введите центр окружности:");
        CenterCirrcle = sc.next();
        Circle circle = new Circle(R,CenterCirrcle);
        int a,b,k;
        System.out.println("Введите сторону квадрата");
        a = sc.nextInt();
        Square square = new Square(a);
        System.out.println("Введите первую сторону прямоугольника:");
        b = sc.nextInt();
        System.out.println("Введите вторую сторону прямоугольника:");
        k = sc.nextInt();
        Rectangle rectangle = new Rectangle(b,k);
        circle.ToString();
        square.ToString();;
        rectangle.ToString();
    }
}
