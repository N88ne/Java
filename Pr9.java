import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
public class Pr9
{
    static ArrayList<String> NumCar=new ArrayList<String>();
    public void Generator()
    {
        String[] letters =new String[]{"A", "B", "E", "K", "M", "H", "O", "P", "C", "T", "Y", "X"};
        for(int X=0;X<letters.length;X++)
        for(int N=0;N<10;N++)
        for(int Y=0;Y<letters.length;Y++)
        for(int Z=0;Z<letters.length;Z++)
        for(int R=1;R<=199;R++)
        {
            String Num=" ";
            if(letters[X]!=letters[Y]&&letters[Y]!=letters[Z]&&letters[X]!=letters[Z])
            {
                if(R<10)
                {
                    Num=letters[X]+N+N+N+letters[Y]+letters[Z]+"0"+R;
                }
                else
                    {
                        Num=letters[X]+N+N+N+letters[Y]+letters[Z]+R;
                    }
                NumCar.add(Num);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Pr9 test=new Pr9();
        test.Generator();
        Scanner scan=new Scanner(System.in);
        System.out.println("Количество сгенерированных номеров: " + NumCar.size());
        System.out.println("Введите номер, который нужно найти: " );
        String count=scan.next();
        long s = System.nanoTime();
        if(NumCar.contains(count))
        {
            System.out.print("Поиск перебором: номер найден");
        }
        else
            System.out.print("Поиск перебором: номер не найден");
            long f = System.nanoTime();
            long time = f - s;
            System.out.println(", поиск занял  " + time +" нс");
            Collections.sort(NumCar);
                boolean check=false;
                s = System.nanoTime();
                if(Collections.binarySearch(NumCar, count) >= 0 )
                {
                    check=true;
                    System.out.print("Бинарный поиск: номер найден");
                }
                if(check==false)
                {
                    System.out.print("Бинарный поиск: номер не найден");
                }
                f = System.nanoTime();
                time = f - s;
                System.out.println(", поиск занял  " + time+" нс");

                HashSet<String> CarSet=new HashSet<>(NumCar);
                s= System.nanoTime();
                if(CarSet.contains(count))
                {
                    System.out.print("Поиск в HashSet: номер найден");
                }
                else System.out.print("Поиск в HashSet: номер не найден");

                f = System.nanoTime();
                time = f - s;
                System.out.println(", поиск занял  " + time+" нс");

                TreeSet<String> tree=new TreeSet<>(NumCar);
                s = System.nanoTime();
                if(tree.contains(count))
                {
                    System.out.print("Поиск в TreeSet: номер найден");
                }
                else System.out.print("Поиск в TreeSet: номер не найден");

                f = System.nanoTime();
                time = f - s;
                System.out.println(", поиск занял  " + time+" нс");
    }
}
