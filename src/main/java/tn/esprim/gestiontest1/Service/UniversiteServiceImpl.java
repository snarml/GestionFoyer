package tn.esprim.gestiontest1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiontest1.repositories.UniversiteRepository;

@Service
public class UniversiteServiceImpl implements IUniversiteService{

    @Autowired
    private UniversiteRepository UniversiteRepository;
}
