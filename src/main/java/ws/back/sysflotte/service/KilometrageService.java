package ws.back.sysflotte.service;

import java.util.List;

import ws.back.sysflotte.model.Kilometrage;

public interface KilometrageService {
    public void saveTrajet(Kilometrage km) throws Exception;
    public void setFinTrajet(Kilometrage km, double fin_trajet) throws Exception;
    public String setKilometrageFin(Kilometrage km, double fin) throws Exception;
    public List<Kilometrage> listTrajet();
    public List<Kilometrage> listTrajetByVehicule(int idvehicule) throws Exception;
    public Kilometrage checkFor(Kilometrage km) throws Exception;
    public void deleteTrajetBy(int idvehicule);
}
