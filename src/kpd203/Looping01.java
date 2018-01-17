import java.util.Scanner;
public class Looping01 {
    public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       System.out.print("Masukan nombor :");
       int no=input.nextInt();
       while(no>=1)
       {
       for(int i=2;i<=no;i++)
       {
       System.out.print(no);
       }
       System.out.println(no);
       no--;
       }
   }
}
