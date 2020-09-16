public class Four
{
    public static void main(String[] args)
    {
        int[] Mas = new int[10];
        for(int i = 0;i<10;i++)
            Mas[i]=(int)(Math.random()*(100+100+1)-100);
        for(int i = 0;i<10;i++)
            System.out.format(" %d",Mas[i]);
        for(int i=0 ; i<10; i++)
        {
            for(int j=0;j<9;j++)
                if(Mas[j]>Mas[j+1])
                {
                    int temp = Mas[j];
                    Mas[j]=Mas[j+1];
                    Mas[j+1]=temp;
                }
        }
        System.out.format("\n");
        for(int i = 0;i<10;i++)
            System.out.format(" %d",Mas[i]);
    }
}
