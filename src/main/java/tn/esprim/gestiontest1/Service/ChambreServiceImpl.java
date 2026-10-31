package tn.esprim.gestiontest1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiontest1.entities.Chambre;
import tn.esprim.gestiontest1.repositories.ChambreRepository;

import java.util.List;

@Service
public class ChambreServiceImpl implements IChambreService{

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public List<Chambre> retrieveAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long chamberId) {
        return chambreRepository.findById(chamberId).get();
    }

    @Override
    public Chambre addChambre(Chambre C) {

        return chambreRepository.save(C);
    }

    @Override
    public void removeChambre(Long chamberId) {
        chambreRepository.deleteById(chamberId);

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);

    }
}

