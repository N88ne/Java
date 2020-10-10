import java.util.Scanner;
class Circle1
{
    private int R;
    private String CenterCircle;
    Circle1(int R, String CenterCircle)
    {
        this.R=R;
        this.CenterCircle= CenterCircle;
    }
    public int GetR()
    {
        return R;
    }
    public String GetCenterCircle()
    {
        return CenterCircle;
    }
    public void SetCenterCircle(String CenterCircle) {this.CenterCircle = CenterCircle; }
    public void SetR(int R)
    {
        this.R = R;
    }
    public void ToString()
    {
        System.out.format("%d \n",R);
        System.out.println(CenterCircle);
    }
}
public class CircleTest
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
        Circle1 test = new Circle1(R,CenterCirrcle);
        test.ToString();
    }
}
