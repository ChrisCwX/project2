import java.util.Scanner;
public class Looping {
    public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       System.out.print("Masukan nombor depan :");
       int x=input.nextInt();
       System.out.print("Masukan nombor belakang :");
       int y=input.nextInt();
       int jum_gn,jum_gp,numb;
       numb=x;
       jum_gn=0;
       jum_gp=0;
       while(numb<y)
       {
           if(numb%2==0)
           {
           jum_gp=jum_gp+numb;
           }
           else
           {
           jum_gn=jum_gn+numb;
           }

          numb++;     
       }
       System.out.println(jum_gp);
       System.out.println(jum_gn);
   }
}
