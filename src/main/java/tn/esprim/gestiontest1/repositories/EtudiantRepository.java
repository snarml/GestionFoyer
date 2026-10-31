package tn.esprim.gestiontest1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestiontest1.entities.Etudiant;


import java.util.Date;
import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findByDateNaissanceBetween(Date date1, Date date2);
}
 