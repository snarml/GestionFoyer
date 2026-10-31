package tn.esprim.gestiontest1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestiontest1.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
