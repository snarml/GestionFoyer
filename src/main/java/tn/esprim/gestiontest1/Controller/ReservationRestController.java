package tn.esprim.gestiontest1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestiontest1.Service.IReservationService;

@RestController
public class ReservationRestController {

    @Autowired
    private IReservationService ReservationService;
}

