/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Family
 */
public class Class {

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

    public class Pengguna {
        Scanner s = new Scanner(System.in);
        int id_user;
        String nama;
        String user;
        String password;
        String confirmpw;
        public void addUser(){
            nama = s.nextLine();
            user = s.nextLine();
            password = s.nextLine();
            confirmpw = s.nextLine();
            if (password.equals(confirmpw)){
                System.out.println("Silahkan login");
            } else {
                System.out.println("Cek password anda");
            }
        }
        public void loginUser(){
            user = s.nextLine();
            password = s.nextLine();
            if(password.equals(confirmpw)){
                System.out.println("Selamat datang "+user);
            } else {
                System.out.println("Silahkan cek ulang username atau password anda");
            }
        }
    }
    public class notifikasi {
        int maksimum;
        int totalPengeluaran;
        public void munculNotif(){
            if(totalPengeluaran>maksimum){
                System.out.println("Pengeluaran anda sudah melebihi target pengeluaran anda");
            }
        }
    }
}
