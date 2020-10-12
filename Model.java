package sample;

public class Model {
    public double calculation(double a, double b,String operator)
    {
        switch (operator){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
        }
        return 0;
    }
    public boolean CheckString(String s)
    {
        char[] A = new char[50] ;
        int k= s.length();
        A = s.toCharArray();
        for(int i=0;i<k;i++)
            if(!(A[i]>=48&& A[i]<=57) && !(A[i] == '.' || A[i]==',' ) )
            {
                return false;
            }
        if(k==0)
            return false;
            else
        return true;
    }
    public double FourSh(double a)
    {
        String s=Double.toString(a);
        int p=0;
        char[] A = new char[50] ;
        int k= s.length();
        A = s.toCharArray();
        s="";
        for(int i=0;i<k;i++)
        {
            if(i - p == 5)
                break;
            else
                {
                if (A[i] == '.' || A[i] == ',')
                {
                    p=i;
                    s=s+A[i];
                }
                else
                {
                    s=s+A[i];
                }
            }
        }
        a= Double.valueOf(s);
        return a;
    }
}
