package ws.back.sysflotte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import ws.back.sysflotte.model.Kilometrage;
import ws.back.sysflotte.service.KilometrageService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/kilometrage")
public class KilometrageController {
    @Autowired
    private KilometrageService kmService;
    
    @PostMapping("/add")
    public String add(@RequestBody Kilometrage km){
        try {
            kmService.saveTrajet(km);
        } catch (Exception e) {
            System.out.println("ERR :"+e.getMessage());
        }
        return "Enregistrement réussie kilometrage";
    }

    @PutMapping("/fin/{fin_km}")
    public String updateKilometrage(@PathVariable double fin_km, @RequestBody Kilometrage km){
        String result = "";
        System.out.println(km.getIdkilometrage());
        try {
            kmService.setKilometrageFin(km, fin_km);
        } catch (Exception e) {
            System.out.println("ERR :"+e.getMessage());
        }return result;
    }

    @GetMapping("/getAll/{idvehicule}")
    public List<Kilometrage> getAll(@PathVariable int idvehicule){
        List<Kilometrage> list = null;
        try {
            list =  kmService.listTrajetByVehicule(idvehicule);
        } catch (Exception e) {
            System.out.println("ERR :"+e.getMessage());
        }
        return list;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        kmService.deleteTrajetBy(id);
    }
}
