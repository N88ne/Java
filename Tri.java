public class Tri
{
 public static void main(String[] args)
 {
     int Sum=0,j=0;
     int[] Mas = new int[10];
     for(int i = 0;i<10;i++)
         Mas[i]=(int)(Math.random()*(100+100+1)-100);
     for(int i = 0;i<10;i++)
         System.out.format(" %d",Mas[i]);
     for(int i = 0; i<10;i++)
         Sum=Sum + Mas[i];
     System.out.format("\n" +
             "Sum = %d \n",Sum);
     Sum=0;
     while(j!=10)
     {
        Sum = Sum + Mas[j];
        j++;
     }
     System.out.format("Sum = %d \n",Sum);
     Sum=0;
     j=0;
     do{
         Sum = Sum + Mas[j];
         j++;
     }while(j!=10);
     System.out.format("Sum = %d \n",Sum);
 }

}
