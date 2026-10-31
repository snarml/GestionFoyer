package tn.esprim.gestiontest1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity 
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor 

public class Chambre {
  @Id 
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long ChambreId;

  private long numeroChambre;

  @Enumerated(EnumType.STRING)
  private TypeChambre typeChambre;
  @ManyToOne
  private Bloc bloc;

  @OneToMany(cascade = CascadeType.ALL)
  private Set<Reservation> reservations;


}
