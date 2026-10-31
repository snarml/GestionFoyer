package tn.esprim.gestiontest1.entities;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter 
@Setter 
@AllArgsConstructor 
@NoArgsConstructor

public class Bloc {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idBloc;
  private String nomBloc;
  private Long capaciteBloc;

  @ManyToOne
  private Foyer foyer;

  @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
  @JsonIgnore
  private Set<Chambre> chambres;


}