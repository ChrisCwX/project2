import java.util.Scanner;
public class Test {
    public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       for(int i=1;i<=3;i++)
       {
           System.out.println("test1");
           int test1=input.nextInt();
           System.out.println("test2");
           int test2=input.nextInt();
           System.out.println("test3");
           int test3=input.nextInt();
           int jwp=test1+test2+test3;
           System.out.println(jwp);
       }
       
   }    
}
