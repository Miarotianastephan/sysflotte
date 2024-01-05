package ws.back.sysflotte.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ws.back.sysflotte.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Integer>{
    
    @Query(value = "Select * from utilisateur WHERE mail= :mail and mdp= :mdp", nativeQuery = true)
    public Utilisateur findUtilisateurByMailAndMdp(@Param("mail") String mail, @Param("mdp") String mdp);

}
