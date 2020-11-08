import java.io.IOError;
import java.util.ArrayList;
import java.util.Scanner;

public class Pr8N1 {
    private static ArrayList<Object> Affairs;
    static void ADD(String[] s){
        int in = 0;
        boolean check = false;
        String s1 = new String();
        int c = 0;
        try {
            in = Integer.parseInt(s[1]);
        }
        catch (NumberFormatException e) {
            check = true;
        }
        if (check) {
            for (String i : s) {
                if (c == 1)
                    s1 = i + " ";
                if (c > 1) {
                    s1 += i;
                    s1 += " ";
                }
                c++;
            }
            Affairs.add(s1);
        } else {
            for (String i : s) {
                if (c == 2)
                    s1 = i + " ";
                if (c > 2) {
                    s1 += i;
                    s1 += " ";
                }
                c++;
            }
            try {
                Affairs.add(in, s1);
            } catch (Exception e) {
                Affairs.add(s1);
            }
        }
    }
    static void EDIT(String[] s){
        int in = 0;
        boolean check = false;
        String s1 = new String();
        int c = 0;
        try {
            in = Integer.parseInt(s[1]);
        }
        catch (NumberFormatException e) {
            System.out.println("Введите заново");
            return;
        }
        for (String i : s) {
            if (c == 2)
                s1 = i + " ";
            if (c > 2) {
                s1 += i;
                s1 += " ";
            }
            c++;
        }
        try {
            Affairs.set(in, s1);
        } catch (Exception e) {
            System.out.println("Введите заново");
        }

    }
    static void DELETE(String[] s)
    {
        int in = 0;
        boolean check = false;
        String s1 = new String();
        int k = 0;
        try {
            in = Integer.parseInt(s[1]);
        } catch (NumberFormatException e) {
            System.out.println("Введите заново");
            return;
        }
        try {
            Affairs.remove(in);
        } catch (Exception e) {
            System.out.println("Введите заново");
        }
    }
    static void LIST()
    {
        int k = 0;
        for (Object i : Affairs) {
            System.out.println(k + " " + i);
            k++;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {
            Affairs = new ArrayList<>();
            boolean check = false;
            while (true) {
                String test = in.nextLine();
                String[] comand = test.split("\\s");
                switch (comand[0]) {
                    case "LIST":
                        LIST();
                        break;
                    case "EDIT":
                        EDIT(comand);
                        break;
                    case "ADD":
                        ADD(comand);
                        break;
                    case "DELETE":
                        DELETE(comand);
                        break;
                    case "EXIT":
                        check = true;
                        break;
                    default:
                        System.out.println("Не верный ввод");
                        break;
                }
                if (check)
                    break;
            }
        }
    }

}
