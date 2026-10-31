package tn.esprim.gestiontest1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprim.gestiontest1.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
