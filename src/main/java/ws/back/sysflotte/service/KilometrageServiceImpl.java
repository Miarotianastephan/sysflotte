package ws.back.sysflotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.back.sysflotte.model.Kilometrage;
import ws.back.sysflotte.model.Vehicule;
import ws.back.sysflotte.repository.KilometrageRepository;

@Service
public class KilometrageServiceImpl implements KilometrageService{
    @Autowired
    KilometrageRepository km_repo;
    @Autowired 
    VehiculeService vehiculeService;
    @Autowired
    VehiculeServiceImpl vehiculeServiceImpl;

    
    @Override
    public void saveTrajet(Kilometrage km) throws Exception{
        if (km_repo == null){
            throw new  Exception("Aucun donnée à inserer");
        }km_repo.save(km);
    }

    @Override
    public void setFinTrajet(Kilometrage km, double fin_trajet) throws Exception{
        Kilometrage km_exist = checkFor(km);
        km_exist.setFinKm(fin_trajet);
        km_repo.save(km_exist);
    }

    @Override
    public String setKilometrageFin(Kilometrage km, double fin) throws Exception {
        System.out.println("Request Km :"+km.getIdkilometrage());
        Kilometrage km_exist = km_repo.findById(km.getIdkilometrage()).orElse(null);
        km_repo.updateFinKm(km_exist.getIdkilometrage(), fin);
        return "Modification réussi";
    }

    @Override
    public List<Kilometrage> listTrajet() {
        return km_repo.findAll();
    }
    
    // Mampiasa custom queries
    @Override
    public List<Kilometrage> listTrajetByVehicule(int idvehicule) throws Exception{
        Vehicule check = vehiculeServiceImpl.searchFor(idvehicule);
        return km_repo.findByIdvehicule(idvehicule);
    }
    
    @Override
    public void deleteTrajetBy(int idkilometrage) {
        km_repo.deleteById(idkilometrage);
    }

    @Override
    public Kilometrage checkFor(Kilometrage km) throws Exception{
        Kilometrage km_exist = km_repo.findById(km.getIdkilometrage()).orElse(null);
        if(km_exist == null){
            System.out.println("KM ID :"+km.getIdkilometrage());
            throw new Exception("Kilometrage non trouvée !!");
        }
        return km_exist;
    }
    
    
}
