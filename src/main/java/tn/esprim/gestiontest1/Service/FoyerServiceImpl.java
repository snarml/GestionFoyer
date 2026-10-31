package tn.esprim.gestiontest1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiontest1.repositories.FoyerRepository;

@Service
public class FoyerServiceImpl implements IFoyerService {

    @Autowired
    private FoyerRepository FoyerRepository;
}
