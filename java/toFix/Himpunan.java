import java.util.Scanner;

/**
 * Himpunan
 */
public class Himpunan 
{
    Scanner scan = new Scanner(System.in);
    int[] himpunanA = new int[100];
	int[] himpunanB = new int[100];
	
	// Deklarasi variabel pada java
	int jumlahAnggotaA;
	int jumlahAnggotaB;

public void HimpunanA() 
    {
    System.out.println("Masukkan Banyak Anggota A: ");
            jumlahAnggotaA=scan.nextInt();
    for (int i =1; i <=jumlahAnggotaA; i++) 
        {
        System.out.print("Masukkan Elemen anggota ke-" +i+ ": ");
            himpunanA[i]=scan.nextInt();
        }
    System.out.print("Anggota Elemen A = {");
    for (int i = 1; i <=jumlahAnggotaA; i++) 
       {
        System.out.print(himpunanA[i] + " ");
        }
    System.out.println("}");
    } 

public void HimpunanB() 
    {
    System.out.println("Masukkan Banyak Anggota B: ");
            jumlahAnggotaB=scan.nextInt();
    for (int i =1; i <=jumlahAnggotaB; i++) 
        {
        System.out.print("Masukkan Elemen anggota ke-" +i+ ": ");
            himpunanB[i]=scan.nextInt();
        }
    System.out.print("Anggota Elemen B = {");
    for (int i = 1; i <=jumlahAnggotaB; i++) 
        {
        System.out.print(himpunanB[i] + " ");
        }
    System.out.print("}");
    }
public void himpunanirisan() 
    {
    System.out.print("Himpunan Irisan dari A n B = { ");
    for (int i = 1; i <=jumlahAnggotaB; i++) 
    {
            boolean sama = false; 
            for (int j = 1; j <= jumlahAnggotaA; j++)
            {
            if (himpunanB[i]==himpunanA[j]) 
                {
                    sama=true;
                } 
                 
                }
            if (sama)
            {
                System.out.print(himpunanB[i] + " ");
            }
         }
         System.out.print("}");
    } 
    
public static void main(String[] args)
     {
       Himpunan bilangan= new Himpunan();
        bilangan.HimpunanA();
        bilangan.HimpunanB();
        bilangan.himpunanirisan();
    
    }
}