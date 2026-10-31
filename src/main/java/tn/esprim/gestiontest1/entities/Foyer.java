package tn.esprim.gestiontest1.entities;

import java.io.Serializable;
import java.util.List;

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

public class Foyer implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nom;
  private long capacite;

  @OneToOne(mappedBy = "foyer")
  @JsonIgnore
  private Universite universite;

  @OneToMany(mappedBy = "foyer")
  @JsonIgnore
  private List<Bloc> blocs;
  
}
