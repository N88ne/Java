public class Pr7N1
{
    public static void main(String[] args) {
        String s="Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int k= s.length();
        int c=0;
        double first=0,second=0;
        char[] A = new char[k];
        A = s.toCharArray();
        String s1="";

        for(int i=0;i<k;i++)
        {
            if(A[i]!=',')
            {
                if(A[i]>=48 && A[i]<=57)
                {
                    s1=s1+A[i];
                }
            }
            else
            {
                break;
            }
        }
        first = Double.valueOf(s1);
        s1="";
        for(int i=0;i<k;i++)
        {
            if(A[i]!=',' && c==2)
            {
                if(A[i]>=48 && A[i]<=57)
                {
                    s1=s1+A[i];
                }
            }
            else
            {
                if(A[i]==',')
                {
                    c++;
                }
            }
        }
        second = Double.valueOf(s1);
        double o=first+second;
        System.out.println("Сумма равна: " + o);
    }

}
