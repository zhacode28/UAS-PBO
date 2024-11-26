/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author zahidahhanumalzahra
 */
@Entity
@Table(name = "datamhs")
@NamedQueries({
    @NamedQuery(name = "Datamhs.findAll", query = "SELECT d FROM Datamhs d"),
    @NamedQuery(name = "Datamhs.findByNim", query = "SELECT d FROM Datamhs d WHERE d.nim = :nim"),
    @NamedQuery(name = "Datamhs.findByNama", query = "SELECT d FROM Datamhs d WHERE d.nama = :nama"),
    @NamedQuery(name = "Datamhs.findByAlamat", query = "SELECT d FROM Datamhs d WHERE d.alamat = :alamat"),
    @NamedQuery(name = "Datamhs.findByAsal", query = "SELECT d FROM Datamhs d WHERE d.asal = :asal"),
    @NamedQuery(name = "Datamhs.findByNamaortu", query = "SELECT d FROM Datamhs d WHERE d.namaortu = :namaortu")})
public class Datamhs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
     @Basic(optional = false)
    @Column(name = "nim")
    private Integer nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "asal")
    private String asal;
    @Column(name = "namaortu")
    private String namaortu;

    public Datamhs() {
    }

    public Datamhs(Integer nim) {
        this.nim = nim;
    }

    public Integer getNim() {
        return nim;
    }

    public void setNim(Integer nim) {
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

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getNamaortu() {
        return namaortu;
    }

    public void setNamaortu(String namaortu) {
        this.namaortu = namaortu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }


   @Override
    public boolean equals(Object object) {
        if (!(object instanceof Datamhs)) {
            return false;
        }
        Datamhs other = (Datamhs) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persistence.Datamhs[ nim=" + nim + ", nama=" + nama + ", namaortu=" + namaortu + " ]";
    }

}
    

