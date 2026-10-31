package tn.esprim.gestiontest1.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiontest1.repositories.EtudiantRepository;

@Service
public class EtudiantServiceImpl implements IEtudiantService{

    @Autowired
    private EtudiantRepository EtudiantRepository ;
}
