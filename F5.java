import java.util.Scanner;
public class F5
{
    static  int Factorial(int a)
    {
        if(a<0)
            return 0;
        if(a==0)
        {
            return 1;
        }
        else
            return a * Factorial(a-1);

    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        System.out.println(Factorial(a));
    }
}
