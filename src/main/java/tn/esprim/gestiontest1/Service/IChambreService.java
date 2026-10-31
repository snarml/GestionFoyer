package tn.esprim.gestiontest1.Service;

import tn.esprim.gestiontest1.entities.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambre();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre C);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
}
