
import java.util.Date;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Raditya Maheswara
 */
public class Transaksi {
    Scanner s = new Scanner(System.in);
    int id_transaksi;
    double nominal;
    String deskripsi;
    Date tanggal;
    String jenis;
    String kategori;
    String riwayatBulanan;
    public void tambahTransaksi(){
        System.out.print("Masukkan jenis transaksi (1 = Pemasukan, 2 = Pengeluaran): ");
        int pilihan = s.nextInt();
        boolean isIncome = (pilihan == 1);
        String jenis = isIncome? "Pemasukan":"Pengeluaran";
        String kategori = s.nextLine();
        String tanggal = s.nextLine();
        String jumlah = s.nextLine();
        String keterangan = s.nextLine();
        }
    }