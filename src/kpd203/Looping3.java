import java.util.Scanner;
public class Looping3 {
    public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       System.out.print("Masukan nombor countdown:");
       int no=input.nextInt();
       while(no>=1)
       {
           System.out.println(no);
           no--;
       }
       
   }
}
