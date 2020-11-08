import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr8N2 {
    static TreeSet <String> Mails = new TreeSet<>();
    static void LIST()
    {
        for(Object i:  Mails)
            System.out.println(i);
    }
    static void ADD(String s)
    {
        if(!CHECK(s))
        {
            System.out.println("Неверный формат");
            return;
        }
        Mails.add(s);
    }
    public static boolean CHECK(String s)
    {
        Pattern mailPattern = Pattern.compile("^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$");
        Matcher matcher = mailPattern.matcher(s);
        return matcher.find();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean check = false;
            while (true) {
                String test = in.nextLine();
                String[] ti = test.split("\\s");
                switch (ti[0]) {
                    case "ADD":
                        ADD(ti[1]);
                        break;
                    case "LIST":
                        LIST();
                        break;
                    case "EXIT":
                        check = true;
                        break;
                    default:
                        System.out.println("Введите заново");
                        break;
                }
                if (check)
                    break;
            }
        }


}
