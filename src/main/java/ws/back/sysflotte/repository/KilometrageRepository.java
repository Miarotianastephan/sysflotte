package ws.back.sysflotte.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import ws.back.sysflotte.model.Kilometrage;

public interface KilometrageRepository extends JpaRepository<Kilometrage,Integer>{
    public List<Kilometrage> findByIdvehicule(int idvehicule);

    @Transactional
    @Modifying  
    @Query(value = "UPDATE kilometrage SET fin = :finkm WHERE idkilometrage = :id", nativeQuery = true)
    public void updateFinKm(@Param("id") int id, @Param("finkm") double finkm);
}
