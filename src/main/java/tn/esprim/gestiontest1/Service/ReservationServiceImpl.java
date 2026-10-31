package tn.esprim.gestiontest1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiontest1.repositories.ReservationRepository;

@Service
public class ReservationServiceImpl implements IReservationService {

    @Autowired
    private ReservationRepository ReservationRepository;
}
