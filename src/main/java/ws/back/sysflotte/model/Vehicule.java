package ws.back.sysflotte.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idvehicule;
    private String matriculation;
    private int idmarque;
    @Column(name = "nb_Place") 
    private double nbPlace;
    private double poids;


    public int getIdvehicule() {
        return idvehicule;
    }
    public void setIdvehicule(int idvehicule) {
        this.idvehicule = idvehicule;
    }
    public String getMatriculation() {
        return matriculation;
    }
    public void setMatriculation(String matriculation) {
        this.matriculation = matriculation;
    }
    public int getIdmarque() {
        return idmarque;
    }
    public void setIdmarque(int idmarque) {
        this.idmarque = idmarque;
    }
    public double getNbPlace() {
        return nbPlace;
    }
    public void setNbPlace(double nbPlace) {
        this.nbPlace = nbPlace;
    }
    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }  

    
}
