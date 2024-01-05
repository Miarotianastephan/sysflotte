package ws.back.sysflotte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ws.back.sysflotte.model.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule,Integer>{
    
}
