import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr7N3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер: ");
        String Num = scan.nextLine();
        int k = Num.length();
        Vector n= new Vector(0);

        for (int i = 0; i < k; i++)
        {
            char c=Num.charAt(i);
            if ('0'<=c&&c<='9')
            {
                n.add(c);
            }
        }
        if(n.size() == 11 || n.size() == 10)
        {
            Pattern numberPattern = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
            Matcher matcher = numberPattern.matcher(Num);
            if (matcher.find())
            {
                if( n.size()==11)
                    System.out.println("Верный формат: +7 ("+n.get(1)+n.get(2)+n.get(3)+") "+n.get(4)
                            +n.get(5)+n.get(6)+"-"+n.get(7)+n.get(8)+"-"+n.get(9)+n.get(10));
                if(n.size()==10)
                    System.out.println("Верный формат: +7 ("+n.get(0)+n.get(1)+n.get(2)+") "+n.get(3)
                            +n.get(4)+n.get(5)+"-"+n.get(6)+n.get(7)+"-"+n.get(8)+n.get(9));

            }
            else System.out.println("Неверный формат номера");
        }
        else
        {
            System.out.println("Неверный формат номера");
        }

    }
}
