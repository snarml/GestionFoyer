package tn.esprim.gestiontest1.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor

public class Reservation implements Serializable {
  @Id
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private boolean estValide;

  @ManyToOne
  private Etudiant etudiant;
}