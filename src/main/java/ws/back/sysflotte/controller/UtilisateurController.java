package ws.back.sysflotte.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import ws.back.sysflotte.model.Utilisateur;
import ws.back.sysflotte.service.UtilisateurService;
import ws.back.sysflotte.service.UtilisateurServiceImpl;

@RestController
@Getter
@CrossOrigin(origins = "*")
public class UtilisateurController {
    
    @Autowired
    public UtilisateurServiceImpl utilisateurServiceImpl;

    @PostMapping(path = "/signin" , produces = "application/json")
    public Hashtable<String, Object> saveUtilisateur(@RequestBody Utilisateur utilisateur){
        Hashtable<String, Object> response = new Hashtable<>();
        utilisateur = this.getUtilisateurServiceImpl().save(utilisateur);
        if(utilisateur == null){
            response.put("status", "Fail");
            response.put("message" , "fail to save user");
        }else{
            response.put("status", "Success");
            response.put("message", "save successfuly");
            response.put("data", utilisateur);
        }
        return response;
    }

    @PostMapping(path = "/login" , produces = "application/json")
    public Utilisateur loginUtilisateur(@RequestBody Utilisateur utilisateur){
        utilisateur = this.getUtilisateurServiceImpl().login(utilisateur);
        return utilisateur;
    }
}
