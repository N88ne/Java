import java.util.Scanner;

public class Pr7N2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = s.length();
        char[] A = new char[k];
        A = s.toCharArray();
        boolean check=true;
        int m=0;
        for (int i = 0; i < k; i++)
        {
            if (!(1040 <= A[i] && A[i] <= 1071 || 1072 <= A[i] && A[i] <= 1103 || A[i] == 45 || A[i] == ' '))
            {
                check = false;
            }
            if(A[i]==' ')
            {
                m++;
            }
            if(m>2)
            {
                check=false;
            }
        }
        if(check)
        {
            switch (m)
            {
                case (1):
                    String s1[]=s.split(" ");
                    System.out.println("Фамилия: "+s1[0]);
                    System.out.println("Имя: "+s1[1]);
                    break;
                case (2):
                    String s2[]=s.split(" ");
                    System.out.println("Фамилия: "+s2[0]);
                    System.out.println("Имя: "+s2[1]);
                    System.out.println("Отчество: "+s2[2]);
                    break;

            }

            }
        else
        {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}
