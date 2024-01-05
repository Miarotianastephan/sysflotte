package ws.back.sysflotte.service;

import ws.back.sysflotte.model.Utilisateur;

public interface UtilisateurService {
    public Utilisateur save(Utilisateur utilisateur);
    
    public Utilisateur login(Utilisateur utilisateur);
}
