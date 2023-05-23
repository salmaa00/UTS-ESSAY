// NAMA  : SALMA SALSABILA
// NPM   : 227064516069
package essay1;

import java.util.Scanner;

public class ESSAYUTS3 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      //menampilkan judul program
       System.out.println("\t## COLDPLAY MUSIC OF THE SPHERES ##");
       System.out.println("\t=========  WORLD TOUR  =========");
       System.out.println("\t    GELORA BUNG KARNO STADIUM ");
       
       //menampikan kategori tiket yang tersedia
       System.out.println("Kategori Tiket Yang Tersedia :");
       System.out.println("Category 1 (Rp.5.000.000)");
       System.out.println("Category 2 (Rp.4.000.000)");
       System.out.println("Category 3 (Rp.3.250.000)");
       System.out.println("Category 4 (Rp.2.500.000)");
       
       //mengambil input dari pengguna
       System.out.print ("Pilih kategori (1-4) :");
      int kat=input.nextInt();
       System.out.print ("Masukan Jumlah Tiket Yang Ingin di beli :");
      int jml=input.nextInt();
      
        int price = 0;
        switch (kat) {
            case 1:
                price = 5000000 * jml;
                break;
            case 2:
                price = 4000000 * jml;
                break;
            case 3:
                price = 3250000 * jml;
                break;
            case 4:
                price = 2500000 * jml;
                break;
            default:
                price = 0;
                break;
        }

        System.out.println("=============================================");
        System.out.println("             INVOICE PEMBELIAN               ");
        System.out.println("=============================================");
        System.out.println("Kategori Tiket: Category " + kat);
        System.out.println("Jumlah Tiket  : " + jml);
        System.out.println("Harga Tiket   : Rp" + price);
        System.out.println("=============================================");

        System.out.print("Masukkan jumlah uang yang akan dibayarkan: ");
        int payment = input.nextInt();

        int change = payment - price;

        System.out.println("Kembalian: Rp" + change);
        System.out.println("=============================================");
    }
}
    
    

