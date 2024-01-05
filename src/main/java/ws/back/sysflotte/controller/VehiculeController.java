package ws.back.sysflotte.controller;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import ws.back.sysflotte.model.Vehicule;
import ws.back.sysflotte.service.VehiculeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/vehicule")
public class VehiculeController {
    @Autowired
    private VehiculeService vehiculeService;

    @PostMapping("/add")
    public String add(@RequestBody Vehicule v){
        vehiculeService.saveVehicule(v);
        return "Voiture de flotte inserer";
    }

    @GetMapping("/getAll")
    public List<Vehicule> getAll(){
        return vehiculeService.getAllVehicule();
    }

    @PutMapping("/poids/{poids}")
    public void updateVehicule(@PathVariable double poids, @RequestBody Vehicule v){
        vehiculeService.updatePoidsVehicule(v, poids);
    }

    @DeleteMapping("/clear/{id}")
    public void clearVehicule(@PathVariable int id){
        vehiculeService.deleteVehicule(id);
    }
    
}
