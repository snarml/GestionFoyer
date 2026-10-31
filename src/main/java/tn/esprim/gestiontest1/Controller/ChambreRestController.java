package tn.esprim.gestiontest1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestiontest1.Service.IChambreService;
import tn.esprim.gestiontest1.entities.Chambre;


import java.util.List;
@RequestMapping("/chambre")
@RestController
public class ChambreRestController {

    @Autowired
    private IChambreService ChambreService;

    //http://localhost:8089/chambre/retrieve-all-chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres(){
        List<Chambre> listChambres = ChambreService.retrieveAllChambre();
        return  listChambres;
    }
    //http://localhost:8089/chambre/retrieve-chambre/8
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre getChambre(@PathVariable("chambre-id")Long chId){

        return ChambreService.retrieveChambre(chId);
    }


    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre = ChambreService.addChambre(c);
        return chambre;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {

        ChambreService.removeChambre(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        Chambre chambre = ChambreService.modifyChambre(c);
        return chambre;
    }

}
