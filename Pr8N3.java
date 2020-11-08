import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Pr8N3{
    static HashMap<String,String> map=new HashMap<>();
    public boolean Check(String s)
    {
        Pattern namePattern = Pattern.compile("^[A-Za-z]+");
        Matcher matcher = namePattern.matcher(s);
        return matcher.find();
    }
    public boolean ChekNum(String s)
    {
        Vector  Num= new Vector(0);
        int k=s.length();
        for (int i = 0; i < k; i++)
        {
            char c=s.charAt(i);
            if ('0'<=c&&c<='9')
            {
                Num.add(c);
            }
        }
        if(Num.size()==11||Num.size()==10)
        {
            Pattern numberPattern = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
            Matcher matcher = numberPattern.matcher(s);
            return matcher.find();
        }
        else
            return false;
    }
    public static void main(String[] args) {

        Pr8N3 All=new Pr8N3();
        Scanner scan=new Scanner(System.in);

        while(true)
        {
            System.out.println("Введите данные: ");
            String test = scan.nextLine();

            switch(test)
            {
                case "LIST":
                {
                    map.entrySet().stream().sorted(Map.Entry.<String, String>comparingByKey()).forEach(System.out::println);
                }
                break;
                case "EXIT":
                {
                    System.out.println("Конец");
                    System.exit(0);
                }
                break;
                default:
                {
                    if(All.Check(test))
                    {
                        if(!(map.containsKey(test)))
                        {
                            System.out.println("Введите номер: ");
                            String Num=scan.nextLine();
                            if(All.ChekNum(Num))
                            {
                                System.out.println(" Записано ");
                                map.putIfAbsent(test,Num);
                            }
                            else
                            {
                                System.out.println(" Неверный формат номера ");
                            }

                        }
                        else
                        {
                            System.out.println(test + " " + map.get(test));
                        }
                    }
                    else
                    {
                        if(All.ChekNum(test)&&map.containsValue(test))
                        {
                            System.out.println("Данные: ");
                            for(Map.Entry<String, String> pair: map.entrySet()){
                                if(test.equals(pair.getValue())){
                                    System.out.println(pair.getKey() + " " + test);
                                }
                            }
                        }
                        else
                            if(All.ChekNum(test))
                        {
                            System.out.println("Введите имя");
                            map.putIfAbsent(scan.nextLine(), test);
                        }
                        else  System.out.println("Ошибка");
                    }
                }
                break;
            }


        }
    }}
