/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import java.util.Random;
public class ProsesArray1D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int i,j,n;
        int jum,max,min;
        int imax,imin; //indeks t4 nilai max min berada
        float rata;
        
        System.out.print("Masukkan banyak data : ");
        n = in.nextInt(); //menjadi ukuran array
        int[] A=new int[n]; //buat array A dengan ukuran n
        
        //isi array A
        //System.out.println("\n*** Mengisi Array A***");
        for(i=0;i<=n-1;i++)
        {
            //System.out.println("Array["+i+"]=");
            //A[i]=in.nextUnt();
            A[i] = rand.nextInt(100)+1; //1-100
        }
        //proses isi array
        jum = A[0];
        max = A[0];  imax=0;
        min = A[0]; imin=0;
        for(i=1;i<=n-1;i++)
        {
            jum=jum+A[i];
            if(A[i]>max)
            {
                max = A[i];
                imax = i;
            }
            if(A[i]<min)
            {
                min = A[i];
                imin = i;
            }
        }
        rata=(float)jum/n;
        //menampilkan isi array A
        System.out.println("\n*** Menampilkan isi Array A***");
        for(i=0;i<n;i++)
        {
            System.out.print(A[i]+"\t");
        }
        //menampilkan isi array A
        System.out.println("\n***Menampilkan Isi Array A yang Ganjil***");
        for(i=0;i<n;i++)
        {
            if(A[i]%2!=0)
                System.out.print(A[i]+"\t");
            //endif  
        }
        //menampilkan isi array A
        System.out.println("\n*** Menampilkan isi Array A pada indeks Ganjil***");
        for(i=0;i<n;i++)
        {
            if(i%2!=0)
                System.out.print(A[i]+"\t");
            //endif
        }
        System.out.println("\nJumlah      =    "+jum);
        System.out.println("Rata-rata      ="+rata);
        System.out.println("Nilai terbesar = "+max+" pada indeks "+imax);
        System.out.println("Nilai terkecil = "+min+" pada indeks "+imin);
    }
    
}
