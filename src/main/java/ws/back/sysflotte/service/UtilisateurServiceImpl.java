package ws.back.sysflotte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ws.back.sysflotte.model.Utilisateur;
import ws.back.sysflotte.repository.UtilisateurRepository;


@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur save(Utilisateur utilisateur) {
        return this.utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur login(Utilisateur utilisateur) {
        String mail = utilisateur.getEmail();
        String mdp = utilisateur.getPassword();
        return this.utilisateurRepository.findUtilisateurByMailAndMdp(mail, mdp);
    }

    
    
}
