 import java.util.Scanner;
public class Looping4 {
    public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int i=0;
       int jwp=0;
       do
       {
       System.out.println("Nombor :");
       int no=input.nextInt();
       jwp=jwp+no;
       i++;
       }
       while(i<6);
       System.out.println("Hasil Tambah 5 nombor ialah :"+jwp);

   }
}