// Nama  : Salma Salsabila
// NPM   : 227064516069
package essay2;
import java.util.Scanner;
public class ESSAY2 {
 
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
          System.out.println("## Program Java cari Nilai Rara-rata ##"); //belum ada petik dua (" ")
          System.out.println("===================================");
          System.out.println();
          
          int[] arr = new int[100];
          int arr_count,i;
          float total,rata2;
          
          System.out.print("input jumlah element array: "); //belum ada .out
          arr_count = input.nextInt(); //belum ada tanda titik koma
          
          System.out.println("Input "+arr_count+" angka (dipisah dengan enter):");
          //sistem setiap angka yang diinput ke dalam array
          
          for(i = 0; i < arr_count; i++){
              arr[i] = input.nextInt(); //next nya memakai Int buka Double
    }
          
          System.out.println();
          
          //cari total semua element array
          total = 0;
          for(i = 0; i< arr_count; i++){
              total = total+arr[i];
          }
          //hitung nilai rata-rata
          rata2 = (total/arr_count);
          System.out.println("Nilai rata-rata dari "+ arr_count + " inputan adalah: "+ rata2); //belum ada tanda + dan menambahkan + setelah Nilai rata-rata dari dan setelah arr_count

    }
}