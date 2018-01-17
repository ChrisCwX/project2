import java.util.Scanner;
public class Kiragaji {
    public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       System.out.println("Masukkan nama pekerja :");
       String nama=input.next();
       
       System.out.println("Masukkan bilangan jam bekerja sehari :");
       int jambekerja=input.nextInt();
       if(jambekerja>9)
       {
           System.out.println("Bilangan jam sehari tidak boleh melebihi 9 jam, sila masukkan bilangan jam yang betul :");
           int jambekerja1=input.nextInt();
           System.out.println("Masukkan bilangan hari bekerja :");
           int haribekerja1=input.nextInt();
                  if(haribekerja1>30)
                  {
                  System.out.println("Bilangan hari bekerja tidak boleh melebihi 30 hari, sila masukkan bilangan hari yang betul:");
                  int haribekerja2=input.nextInt();
                  System.out.println("Masukkan bilangan jam kerja lebih masa :");
                  int jambekerjaot2=input.nextInt();
                         if(jambekerjaot2>50)
                         {
                         System.out.println("Bilangan jam kerja lebih masa tidak boleh melebihi 50 jam, sila masukkan bilangan jam yang betul:");
                         int jambekerjaot3=input.nextInt();
                         double gaji3=jambekerja1*haribekerja2*20+(jambekerjaot3*15);
                         System.out.println("Rumusan gaji bulanan"+nama+"+ ");
                         System.out.println("Jumlah jam bekerja : "+jambekerja1+ "jam");
                         System.out.println("Jumlah hari bekerja : "+haribekerja2+ "hari");
                         System.out.println("Jumlah jam lebih masa : "+jambekerjaot3+ "jam");
                         System.out.println("JUMLAH GAJI : RM "+gaji3);                        
                         }
                        else
                        {
                        System.out.println("Error");
                        }
                      double gaji2=jambekerja1*haribekerja2*20+(jambekerjaot2*15);
                      System.out.println("Rumusan gaji bulanan"+nama+": ");
                      System.out.println("Jumlah jam bekerja : "+jambekerja1+ "jam");
                      System.out.println("Jumlah hari bekerja : "+haribekerja2+ "hari");
                      System.out.println("Jumlah jam lebih masa : "+jambekerjaot2+ "jam");
                      System.out.println("JUMLAH GAJI : RM "+gaji2);
                  }
                  else
                  {
           System.out.println("Masukkan bilangan jam kerja lebih masa :");
           int jambekerjaot1=input.nextInt();
           double gaji1=jambekerja1*haribekerja1*20+(jambekerjaot1*15);
           System.out.println("Rumusan gaji bulanan"+nama+": ");
           System.out.println("Jumlah jam bekerja : "+jambekerja1+ "jam");
           System.out.println("Jumlah hari bekerja : "+haribekerja1+ "hari");
           System.out.println("Jumlah jam lebih masa : "+jambekerjaot1+ "jam");
           System.out.println("JUMLAH GAJI : RM "+gaji1);
                  }
       }
    else 
    {
    System.out.println("Masukkan bilangan hari bekerja :");
    int haribekerja=input.nextInt();
    System.out.println("Masukkan bilangan jam kerja lebih masa :");
    int jambekerjaot=input.nextInt();
    double gaji=jambekerja*haribekerja*20+(jambekerjaot*15);
    System.out.println("Rumusan gaji bulanan"+nama);
    System.out.println("Jumlah jam bekerja : "+jambekerja+ "jam");
    System.out.println("Jumlah hari bekerja : "+haribekerja+ "hari");
    System.out.println("Jumlah jam lebih masa : "+jambekerjaot+ "jam");
    System.out.println("JUMLAH GAJI : RM "+gaji);
}}}