package ws.back.sysflotte.service;

import java.util.List;
import ws.back.sysflotte.model.Vehicule;

public interface VehiculeService {
    public Vehicule saveVehicule(Vehicule v);
    public List<Vehicule> getAllVehicule();
    public void deleteVehicule(int id);
    public void updatePoidsVehicule(Vehicule v, double p);
}
