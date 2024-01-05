package ws.back.sysflotte.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class Kilometrage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idkilometrage;
    
    private int idvehicule;
    
    @Column(name = "date_circulation")
    private String dateCirculation;

    @PrePersist
    public void beforeInsert(){
        if (dateCirculation == null) {
            dateCirculation = new Timestamp(System.currentTimeMillis()).toString();
        }
    }

    @Column(name = "debut")
    private double debutKm;
    
    @Column(name= "fin")
    private double finKm;

    public int getIdkilometrage() {
        return idkilometrage;
    }
    public void setIdkilometrage(int idkilometrage) {
        this.idkilometrage = idkilometrage;
    }

    public int getIdvehicule() {
        return idvehicule;
    }

    public void setIdvehicule(int idvehicule) {
        this.idvehicule = idvehicule;
    }

    public String getDateCirculation() {
        return dateCirculation;
    }

    public void setDateCirculation(String dateCirculation) {
        this.dateCirculation = dateCirculation;
    }

    public double getDebutKm() {
        return debutKm;
    }

    public void setDebutKm(double debutKm) {
        this.debutKm = debutKm;
    }

    public double getFinKm() {
        return finKm;
    }

    public void setFinKm(double finKm) {
        this.finKm = finKm;
    }  
}
