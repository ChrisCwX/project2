import java.util.Scanner;
public class Looping5 {
    public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int i=0;
       int jwp=3;
       int no1=3;
       int no2=1;
       do
       {
       System.out.println(no2+" x 3 ="+jwp);
       jwp=jwp+no1;
       no2=no2+1;
       i++;
       }
       while(i<12);
   }
}