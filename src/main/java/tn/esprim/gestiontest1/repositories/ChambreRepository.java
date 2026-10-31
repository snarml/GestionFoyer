package tn.esprim.gestiontest1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestiontest1.entities.Chambre;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
