
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Raditya Maheswara
 */
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
