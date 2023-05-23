// Nama  : Salma Salsabila
// NPM   : 227064516069

package essay1;
import java.util.Scanner;

public class ESSAY1 {
    public static void main(String[] args) { //membuat scanner baru dengan input
        Scanner masuk=new Scanner(System.in); 
        int pilihan; //memasukkan variabel integer
        System.out.println("HARGA TIKET KONSER NIKI"); //menampilkan output HARGA TIKET KONSER NIKI
        System.out.println("CATEGORY 1"); //menampilkan output CATEGORY 1
        System.out.println("CATEGORY 2"); //menampilkan output CATEGORY 2
        System.out.println("MASUKKAN PILIHAN CATEGORY : "); //menampilkan output MASUKKAN PILIHAN CATEGORY
        
        pilihan=masuk.nextInt(); //menyimpan variabel pilihan
        if (pilihan==1) //jika memilih pilihan 1
            System.out.println("Harga tiket Category 1 : Rp.1.000.000"); //maka akan menampilkan output pilihan 1
        else if (pilihan==2) //jika memilih pilihan 2
            System.out.println("Harga tiket Category 2 : Rp.800.000");//maka akan menampilkan output pilihan 2
        else //jika memilih selain pilihan 1 dan pilihan 2
            System.out.println("MAAF KODE INI SALAH, HARAP COBA LAGI"); //maka akan menampilkan output MAAF KODE INI SALAH, HARAP COBA LAGI
        
        for (int i=1; i>0; i--){ //untuk melakukan perulangan 1 < i=0
            
            for (int j=1; j>0; j++){ // untuk melakukan perulangan  1 > j>0
                System.out.println("Apakah anda yakin?"); //menampilkan output Apakah anda yakin?
                System.out.println("1.Ya"); //menampilkan output 1.Ya
                System.out.println("2.Tidak"); //menampilkan output 2.Tidak
                System.out.println("pilih :"); //menampilkan output pilih :
                pilihan=masuk.nextInt(); //menyimpan variabel pilihan
        if (pilihan==1) //jika memilih pilihan 1
            System.out.println("Selamat Menonton!!!"); //maka akan menampilkan output Selamat Menonton!!!
        else if (pilihan==2) //jika memilih pilihan 2
            System.out.println("MASUKKAN PILIHAN CATEGORY : "); //makan akan menampilkan output MASUKKAN PILIHAN CATEGORY
            pilihan=masuk.nextInt(); //menyimpan variabel pilihan
        if (pilihan==1) //jika memilih pilihan 1
            System.out.println("Harga tiket Category 1 : Rp.1.000.000"); //akan menampilkan output pilihan 1
        else if (pilihan==2) //jika memilih pilihan 2
            System.out.println("Harga tiket Category 2 : Rp.800.000"); //akan menampilkan output pilihan 2
        else //jika memilih selain pilihan 1 dan pilihan 2
            System.out.println("MAAF KODE INI SALAH, HARAP COBA LAGI"); //maka akan menampilkan output MAAF KODE INI SALAH, HARAP COBA LAGI
            }
        }       
    }
}
