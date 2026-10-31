package tn.esprim.gestiontest1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestiontest1.repositories.BlocRepository;

@Service
public class BlocServiceImpl implements IBlocService{

    @Autowired
    private BlocRepository blockRepository;
}
