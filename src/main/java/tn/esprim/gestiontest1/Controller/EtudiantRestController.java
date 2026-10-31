package tn.esprim.gestiontest1.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestiontest1.Service.IEtudiantService;

@RestController
public class EtudiantRestController {

    @Autowired
    private IEtudiantService EtudiantService;
}
