package data.pengunjung;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author INTAN NUR OKTAVIA_20103321
 */
public class DataPengunjung {

    public static void main(String[] args) {
        Scanner nama = new Scanner (System.in);
        ArrayList <String> data = new ArrayList<String>();
        int n;
        do {
            System.out.println("Daftar Nama Pengunjung Kebun Binatang");
            System.out.println ("1. Tampilkan Data Pengunjung");
            System.out.println ("2. Isi data");
            System.out.println ("3. Keluar");
            System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print ("Pilih Menu :");
            n = nama.nextInt ();
            
            if (n==1){
                
                if (data.size () == 0){
                    System.out.println("");
                    System.out.println("\n Daftar Pengunjung Kebun Binatang\n");
                    System.out.println("Belum Ada Pengunjung");
                    System.out.println("");
                    System.out.println("Silahkan Pilih Menu Di Bawah Ini....");
                    
                }else {
                    System.out.println("\n Data Nama Pengunjung");
                    for (int i = 0; i < data.size(); i++){
                    System.out.println((i+1)+". "+data.get(i));
                    }
                    System.out.println("");
                    System.out.println("Total Jumlah Pengunjung: "+data.size ()+" pengunjung");
                    System.out.println("");
                    System.out.println("Silahkan Pilih Menu Di Bawah ini....");
                    }
                
                }else if (n==2){
                    System.out.println("");
                    System.out.println("Isi Data Nama Pengunjung");
                    System.out.print("Nama Pengunjung :");
                    String Kd = nama.next();
                    data.add(Kd);
                    System.out.println("");
                    System.out.println("Data Pengunjung Telah Di Record, Silahkan Pilih Menu Di Bawah Ini....");
                
                }else if (n==3){
                    System.out.println("\n\n");
                    System.out.println("TERIMAKASI TELAH BERKUNJUNG");
                    System.out.println("\n\n");
                    
                }else if (n>3){
                    System.out.println("\n\n");
                    System.out.println("Opsi Pilihan tidak terdaftar, silahlan pilih 1, 2 atau 3");
                    System.out.println ("\n\n");
                    }
          }while (n!=3);
    }
    
}
    

