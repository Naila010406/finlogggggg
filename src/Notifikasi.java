/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Raditya Maheswara
 */
public class Notifikasi {
    int maksimum;
    int totalPengeluaran;
    public void munculNotif(){
        if(totalPengeluaran>maksimum){
            System.out.println("Pengeluaran anda sudah melebihi target pengeluaran anda");
        }
    }
}