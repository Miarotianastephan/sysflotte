package ws.back.sysflotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.back.sysflotte.model.Vehicule;
import ws.back.sysflotte.repository.VehiculeRepository;

@Service
public class VehiculeServiceImpl implements VehiculeService{
    @Autowired
    VehiculeRepository vehicule_repo;

    @Override
    public List<Vehicule> getAllVehicule() {
        return vehicule_repo.findAll();
    }

    @Override
    public Vehicule saveVehicule(Vehicule vehicule) {
        return vehicule_repo.save(vehicule);
    }

    @Override
    public void deleteVehicule(int id) {        
        Vehicule v_existing = vehicule_repo.findById(id).orElse(null);
        System.out.println(v_existing.getMatriculation());
        if(v_existing != null){
            vehicule_repo.delete(v_existing);
        }
     }

    @Override
    public void updatePoidsVehicule(Vehicule vehicule,double p) {
        Vehicule v_existing = vehicule_repo.findById(vehicule.getIdvehicule()).orElse(null);
        if(v_existing != null){
            v_existing.setPoids(p);
            vehicule_repo.save(v_existing);
        }
    }

    public Vehicule searchFor(int idvehicule) throws Exception{
        Vehicule result = vehicule_repo.findById(idvehicule).orElse(null);
        if(result == null)throw new Exception("SEARCH ERREUR : vehicule"+idvehicule);
        return result;
    }
    
}
