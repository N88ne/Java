import java.util.Scanner;
class Head
{
    private String HairColor;
    Head(String HairColor)
    {
        this.HairColor = HairColor;
    }
    void Think()
    {
        System.out.println("Я думаю");
    }
    public String GetHairColor()
    {
        return HairColor;
    }
    public void SetHairColor(String HairColor) { this.HairColor = HairColor; }
    public void ToString() { System.out.println(HairColor); }
}
class Hand
{
    private String QualityHand;
    Hand(String QualityHand)
    {
        this.QualityHand=QualityHand;
    }
    void Take()
    {
        System.out.println("Я взял");
    }
    void Put()
    {
        System.out.println("Я положил");
    }
    public String GetQualityHand()
    {
        return QualityHand;
    }
    public void SetQualityHand(String QualityHand) { this.QualityHand = QualityHand; }
    public void ToString() { System.out.println(QualityHand); }
}
class Leg
{
    String QualityLeg;
    Leg(String QualityLeg)
    {
        this.QualityLeg=QualityLeg;
    }
    void Go()
    {
        System.out.println("Я иду");
    }
    void Run()
    {
        System.out.println("Я бегу");
    }
    public String GetQualityLeg()
    {
        return QualityLeg;
    }
    public void SetQualityLeg(String QualityLeg) { this.QualityLeg = QualityLeg; }
    public void ToString() { System.out.println(QualityLeg); }
}
public class Human
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String QualityLeg,QualityHand,HairColor;
        System.out.println("Введите цвет волос");
        HairColor = sc.next();
        Head head = new Head(HairColor);
        System.out.println("Введите качество руки");
        QualityHand = sc.next();
        Hand hand = new Hand(QualityHand);
        System.out.println("Введите качество ноги");
        QualityLeg = sc.next();
        Leg leg = new Leg(QualityLeg);
        head.Think();
        hand.Take();
        hand.Put();
        leg.Go();
        leg.Run();
        head.ToString();
        hand.ToString();
        leg.ToString();
    }
}
