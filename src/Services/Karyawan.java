/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author LENOVO
 */
public class Karyawan {
    private String id;
    private String nama;
    private String divisi;
    private String alamat;

   
    
    public boolean equals(Object obj) {
        Karyawan kryw = (Karyawan) obj;
        return id.equals(kryw.getId());
    }
    
    public Karyawan(String id, String nama, String divisi, String alamat) {
        this.id = id;
        this.nama = nama;
        this.divisi = divisi;
        this.alamat = alamat;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getDivisi() {
        return divisi;
    }
    
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
        
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
        

    }
}
    

