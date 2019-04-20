/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import entity.*;
import Services.*;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Aplikasi {
    
    private static Scanner scanner;
    private static Karyawan_Services service = new Karyawan_Services();
    
    public static void main(String[] args) {
        int opsi = 5;
        do {
            tampilkanMenu();
            scanner = new Scanner(System.in);
            try {
                opsi = scanner.nextInt();
            } catch (Exception e) {
                System.err.println("Ada kesalahan input");
                opsi = 0;
            }
            proses(opsi); 
        } while(opsi != 5);
    }
    
    private static void proses (int opsi) {
        switch(opsi) {
            case 1 :
                tampilkanFormTambahData();
                break;
            case 2 :
                tampilkanFormUbahData();
                break;
            case 3 :
                tampilkanFormHapusData();
                break;
            case 4 :
                service.tampilkanData();
                break;
        }
    }
    
    private static void tampilkanFormHapusData(){
        scanner = new Scanner(System.in);
        String id;
        
        System.out.println("\n--= Form Hapus Data");
        System.out.println("ID : ");
        id = scanner.nextLine();
        service.hapusData(id);
    }
    
    private static void tampilkanFormUbahData() {
        scanner = new Scanner(System.in);
        String id, nama, divisi, alamat;
        
        System.out.println("\n--= Form Ubah Data");
        System.out.print ("ID : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("DIVISI : ");
        divisi = scanner.nextLine();
        System.out.print("ALAMAT : ");
        alamat = scanner.nextLine();
        service.ubahData(new Karyawan(id, nama, divisi, alamat));
    }
    
    private static void tampilkanFormTambahData() {
        scanner = new Scanner(System.in);
        String id, nama, divisi, alamat;
        
        System.out.println("\n--= Form Tambah Data");
        System.out.print ("ID : ");
        id = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("DIVISI : ");
        divisi = scanner.nextLine();
        System.out.print("ALAMAT : ");
        alamat = scanner.nextLine();
        service.tambahData(new Karyawan(id, nama, divisi, alamat));
    }
    
    private static void tampilkanMenu() {
        System.out.println("\n--= Menu Aplikasi =--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("---------------");
        System.out.print ("opsi > ");
                
    }
}
    

