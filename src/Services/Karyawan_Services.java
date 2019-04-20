/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Karyawan_Services {
    private static List<Karyawan> data = new LinkedList<Karyawan> ();
    
    public void tambahData(Karyawan kryw) {
        data.add(kryw);
        System.out.println( " Data sudah disimpan " );
    }
    
    public void ubahData(Karyawan kryw) {
        int idx = data.indexOf(kryw);
        if(idx >= 0) data.set(idx, kryw);
        System.out.println( " Data sudah berubah " );
    }
    
    public void hapusData(String id) {
        int idx = data.indexOf(new Karyawan (id, " ", " " ," "));
        if(idx >= 0) data.remove(idx);
        System.out.println(" Data telah terhapus");
    }
    
    public void tampilkanData() {
        System.out.println("\n-= Isi Data =-");
        int urutan = 1 ;
        for(Karyawan kryw : data) {
        System.out.println("data data" + urutan++);
        System.out.println(" ID: " + kryw.getId());
        System.out.println(" NAMA: " + kryw.getNama());
        System.out.println(" DIVISI: " + kryw.getDivisi());
        System.out.println(" ALAMAT: " + kryw.getAlamat());
        }  
    }
}
    

