/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Annisa
 */
public class mhs extends BaseEntity{
    
    private String nim;
    private String nama;
    private String alamat;

    public mhs() {
    }

    public mhs(long id) {
        super(id);
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
