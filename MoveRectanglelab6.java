import java.util.Scanner;
interface Movable {
void Move(double stepX,double stepY);
}
class MoveRectangle implements Movable
{
    private double movePointX1,movePointY1,  movePointX2,  movePointY2;
    @Override
    public void Move(double stepX, double stepY) {
        this.movePointX1= this.movePointX1 + stepX;
        this.movePointX2= this.movePointX2 + stepX;
        this.movePointY1= this.movePointY1 + stepY;
        this.movePointY2= this.movePointY2 + stepY;
    }
    public void Test() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты х и у для точки левого верхнего угла прямоугольника: ");
        this.movePointX1 = in.nextDouble();
        this.movePointY1 = in.nextDouble();
        System.out.println("Введите координаты х и у для точки правого нижнего угла прямоугольника: ");
        movePointX2 = in.nextDouble();
        movePointY2 = in.nextDouble();
        System.out.println("Введите сдвиг по х для левой верхней и правой нижней точки: ");
        double one = in.nextDouble();
        double two = in.nextDouble();
        double a =  Proverka(one,two);
        System.out.println("Введите сдвиг по y для левой верхней и правой нижней точки: ");
        one = in.nextDouble();
        two = in.nextDouble();
        double b = Proverka(one,two);
        Move(a,b);
        ToString();
    }
    public double  Proverka(double x1,double x2)
    {
        Scanner in = new Scanner(System.in);
        if(x1 != x2) {
            while (x1 != x2)
            {
                System.out.println("Точки должны двигаться с одинаковой скоростью, введите заново: ");
                x1 = in.nextDouble();
                x2 = in.nextDouble();
            }
        }
        return x1;
    }

    public void ToString()
    {
        System.out.println("x1 и y1:    " + this.movePointX1 + " : "  + this.movePointY1 );
        System.out.println("x2 и y2:    " + this.movePointX2 + " : " + this.movePointY2);
    }
}


public class MoveRectanglelab6 {
    public static void main(String[] args)
    {
        MoveRectangle test = new MoveRectangle();
        test.Test();
    }
}
