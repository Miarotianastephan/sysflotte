package ws.back.sysflotte.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "utilisateur")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idutilisateur;
    
    @Column(name = "nom_utilisateur", nullable = false, columnDefinition = "VARCHAR(100)")
    private String nomUtilisateur;

    @Column(name = "prenom_utilisateur", nullable = false, columnDefinition = "VARCHAR(100)")
    private String prenomUtilisateur;
    
    @Column(name = "date_naissance", nullable = false, columnDefinition = "DATE")
    private String dateNaissance;

    @Column(name = "mail", nullable = false, columnDefinition = "VARCHAR(100)")
    private String email;

    @Column(name = "mdp", nullable = false, columnDefinition = "VARCHAR(100)")
    private String password;
}
